package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server implements Runnable{
    private File arquivo;
    private Socket cliente;
    private ArrayList<String> usuarios;
    private ArrayList<String> ultimasMensagens;
    private ArrayList<Socket> clientes;

    public Server(Socket cliente, ArrayList<String> usuarios, ArrayList<String> ultimasMensagens,
                  ArrayList<Socket> clientes, File arquivo){
        this.cliente = cliente;
        this.ultimasMensagens = ultimasMensagens;
        this.usuarios = usuarios;
        this.clientes = clientes;
        this.arquivo =  arquivo;
    }

    private void sendMessageToAll(String message, ArrayList<Socket> clientes, Socket eu, File file){
        for(Socket cliente : clientes){
            try {
                PrintStream saida = new PrintStream(cliente.getOutputStream());
                if(cliente != eu){
                    saida.println(message);
                    saida.flush();
                } else {
                    ArrayList<String> printTrue = new ArrayList<>();
                    synchronized (this.arquivo){
                        ObjectInputStream inputStream = null;
                        try {
                            inputStream = new ObjectInputStream(new FileInputStream(file));
                            printTrue = (ArrayList<String>)inputStream.readObject();

                        } catch (IOException | ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    for(String frase: printTrue){
                        saida.println(frase);
                    }
                    saida.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendMessageToAll(String message, ArrayList<Socket> clientes, File file){
        ArrayList<String> arquivoLido = new ArrayList<>();
        for(Socket cliente : clientes){
            try {
                PrintStream saida = new PrintStream(cliente.getOutputStream());
                saida.println(message);
                saida.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        synchronized (file){
            ObjectInputStream inputStream = null;
            try {
                inputStream = new ObjectInputStream(new FileInputStream(arquivo));
                arquivoLido = (ArrayList<String>)inputStream.readObject();
                arquivoLido.add(message);
                ObjectOutputStream streamSaida = null;
                try {
                    streamSaida = new ObjectOutputStream(new FileOutputStream(file));
                    streamSaida.writeObject(arquivoLido);
                    streamSaida.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    private String messageAddNickName(String[] mensagemEmArray, String nickname){
        String mensagemResultado = "MSG " + nickname + " ";
        for(int contador = 1; contador < mensagemEmArray.length; contador++){
            mensagemResultado = mensagemResultado.concat(mensagemEmArray[contador] + " ");
        }
        return mensagemResultado;
    }

    public static void main(String[] args)  throws IOException {
        ArrayList<String> usuarios = new ArrayList<String>();
        ArrayList<String> ultimasMensagens = new ArrayList<String>();
        ArrayList<Socket> clientes = new ArrayList<Socket>();
        ServerSocket servidor = new ServerSocket (8976);
        File file = new File("messages.txt");

        if(!file.exists()){
            ArrayList<String> fileSample = new ArrayList<>();
            file.createNewFile();
            for(int contador = 0; contador < 20; contador++){
                fileSample.add(" ");
            }
            ObjectOutputStream streamSaida = null;
            try {
                streamSaida = new ObjectOutputStream(new FileOutputStream(file));
                streamSaida.writeObject(fileSample);
                streamSaida.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        while (true) {
            Socket cliente = servidor.accept();
            clientes.add(cliente);
            Server tratamento = new Server(cliente, usuarios, ultimasMensagens, clientes, file);
            Thread t = new Thread(tratamento);
            t.start();
        }
    }

    public void run(){
        String nickname = "";
        int contador = 0;

        try {
            Scanner s = null;
            s = new Scanner(this.cliente.getInputStream());
            if (this.usuarios.size() > 100) {
                PrintStream saida = new PrintStream(this.cliente.getOutputStream());
                saida.println("ERRO NUMERO_MAXIMO_DE_CONEXOES_ATINGIDO");
                saida.flush();
                saida.close();
            }else {
                while(s.hasNextLine()){
                    String mensagemRecebida = s.nextLine();
                    String[] mensagemRecebidaQuebrada = mensagemRecebida.split(" ");
                    String mensagemComNickname = this.messageAddNickName(mensagemRecebidaQuebrada, nickname);
                    if(contador == 0){
                        if(mensagemRecebidaQuebrada[0].equals("ENTRAR")){
                            nickname = mensagemRecebidaQuebrada[1];
                            if(this.usuarios.contains(nickname)){
                                PrintStream saida = new PrintStream(this.cliente.getOutputStream());
                                saida.println("ERRO USUARIO_JA_LOGADO");
                                saida.flush();
                                saida.close();
                            } else {
                                synchronized (this.usuarios) {
                                    this.usuarios.add(nickname);
                                }
                                    sendMessageToAll("MSG " + nickname + " Entrou no grupo", clientes, this.cliente, this.arquivo);
                            }
                            if(usuarios.size() == 0){
                                synchronized (this.usuarios) {
                                    this.usuarios.add(nickname);
                                }
                            }
                        }
                    } else {
                        if(mensagemRecebidaQuebrada[0].equals("MSG")){
                            sendMessageToAll(mensagemComNickname, clientes, this.arquivo);
                        } else if (mensagemRecebidaQuebrada[0].equals("SAIR")){
                            cliente.close();
                            clientes.remove(cliente);
                            usuarios.remove(nickname);
                            sendMessageToAll("MSG " + nickname + " saiu do grupo", clientes, cliente, this.arquivo);

                        } else {
                            PrintStream saida = new PrintStream(this.cliente.getOutputStream());
                            saida.println("ERRO ERRO_INESPERADO");
                            saida.flush();
                            saida.close();
                        }
                    }
                    contador++;
                }
            }

            s.close();
            this.cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}