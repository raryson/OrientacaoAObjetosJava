package com.company;

import java.net.Socket;
import java.util.Scanner;

public class ClienteQueOuve implements  Runnable {
    private Scanner entrada;
    private Socket cliente;

    public ClienteQueOuve(Scanner entrada,  Socket cliente){
        this.entrada = entrada;
        this.cliente = cliente;
    }

    public void run(){
        while(entrada.hasNextLine()){
            System.out.println(entrada.nextLine());
            if(this.cliente.isClosed()) break;
        }
    }
}
