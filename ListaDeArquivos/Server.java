package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server implements Runnable{
    private File arquivo;
    private Socket cliente;

    public Server(Socket cliente){
        this.cliente = cliente;
    }


    public static void main(String[] args)  throws IOException {
        ServerSocket servidor = new ServerSocket (54321);
        while (true) {
            Socket cliente = servidor.accept();
            Server tratamento = new Server(cliente);
            Thread t = new Thread(tratamento);
            t.start();
        }
    }

    public void run(){

        try {
            Scanner s = null;
            s = new Scanner(this.cliente.getInputStream());
            while(s.hasNextLine()){
                String mensagemRecebida = s.nextLine();

                }


            s.close();
            this.cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}