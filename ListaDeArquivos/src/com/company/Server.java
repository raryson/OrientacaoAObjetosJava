package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server implements Runnable{
    private Socket cliente;

    public Server(Socket cliente){
        this.cliente = cliente;
    }


    public static void main(String[] args)  throws IOException {
        ServerSocket servidor = new ServerSocket (54321);
        int pastas = 0, arquivos = 0;
        while (true) {
            Socket cliente = servidor.accept();
            Server tratamento = new Server(cliente);
            Thread t = new Thread(tratamento);
            t.start();
        }
    }

    public void run(){

        try {
            int pastas = 0;
            int arquivos = 0;
            Scanner s = null;
            s = new Scanner(this.cliente.getInputStream());
            PrintStream volta = new PrintStream(this.cliente.getOutputStream());
            while(s.hasNextLine()){
                String mensagemRecebida = s.nextLine();
                File file = new File(mensagemRecebida);
                if(file.isDirectory()){
                    pastas++;
                    for(String arquivo: file.list()){
                        File cacheFile = new File(arquivo);
                        if(cacheFile.isDirectory()){
                            pastas++;
                        }else{
                            arquivos++;
                        }
                        volta.println(arquivo);
                        volta.flush();
                    }
                    volta.println("A quantidade de pastas lidas foi: " + pastas);
                    volta.print("A quantidade de aruivos lidos foi: " + arquivos);
                    volta.close();
                }else{
                    volta.print("PASTA_INEXISTENTE");
                    volta.flush();
                    volta.close();
                }

            }
            s.close();
            this.cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}