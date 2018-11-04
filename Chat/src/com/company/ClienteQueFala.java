package com.company;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteQueFala implements  Runnable {
    private PrintStream falador;
    private Scanner teclado;
    private Socket cliente;

    public ClienteQueFala(PrintStream falador, Scanner teclado, Socket cliente){
        this.falador = falador;
        this.teclado = teclado;
        this.cliente = cliente;

    }

    public void run(){
        while(true){
                String coisaDigitada = teclado.nextLine();
                if(!coisaDigitada.equals("SAIR")){
                    coisaDigitada = "MSG " + coisaDigitada;
                }
                falador.println(coisaDigitada);
                falador.flush();
                teclado.reset();
                if(cliente.isClosed()){
                    break;
                }
        }
    }
}
