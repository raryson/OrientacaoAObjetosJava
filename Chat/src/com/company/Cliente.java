package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente implements Runnable{

    private Socket cliente;
    private Dados dados;

    public Cliente(Socket cliente, Dados dados){
        this.cliente = cliente;
        this.dados = dados;
    }

    public static void main(String args[]) throws UnknownHostException, IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o IP para a conexao");
        String ip = teclado.nextLine();
        System.out.println("Digite o nick que voce deseja");
        String nome = teclado.nextLine();

        Dados dados = new Dados(nome, ip);
        Socket socket = new Socket(dados.getIp(), 8976);
        Cliente c = new Cliente(socket, dados);
        Thread t = new Thread(c);
        t.start();
    }

    public void run() {
        try {
            PrintStream saida;
            String startMessage = "ENTRAR " + dados.getNome();
            Scanner teclado = new Scanner(System.in);

            saida = new PrintStream(this.cliente.getOutputStream());
            saida.println(startMessage);
            saida.flush();

            Scanner s = new Scanner(this.cliente.getInputStream());
            ClienteQueOuve clienteQueOuve = new ClienteQueOuve(s, cliente);
            Thread entrada = new Thread(clienteQueOuve);
            entrada.start();

            ClienteQueFala clienteQueFala = new ClienteQueFala(saida, teclado, cliente);
            Thread threadSaida = new Thread(clienteQueFala);
            threadSaida.start();

            if(!threadSaida.isAlive()){
                saida.close();
                teclado.close();
                this.cliente.close();
                System.out.println("Fim do cliente!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

