package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente{

    public static void main(String args[]) throws UnknownHostException, IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome da pasta para pesquisar");
        String nomeDaPasta = teclado.nextLine();
        Socket socket = new Socket("0.0.0.0", 54321);
        PrintStream saida = new PrintStream(socket.getOutputStream());
        saida.println(nomeDaPasta);
        saida.flush();
        Scanner entrada = new Scanner(socket.getInputStream());
        while(entrada.hasNextLine()){
            String mensagemRecebida = entrada.nextLine();
            System.out.println(mensagemRecebida);
        }
    }

}
