package com.company;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

    public static void main(String[] args) {
            try {
                Socket s = new Socket("localhost", 6543);
                Scanner entrada = new Scanner(new InputStreamReader(s.getInputStream()));
                PrintWriter saida = new PrintWriter(s.getOutputStream());

                while(true) {
                    saida.println("PAPO\n");
                    saida.flush();

                    String linha;
                    while ((linha = entrada.nextLine()).length() != 0) {
                        System.out.println(linha);
                    }

                }


            } catch (UnknownHostException ex) {
                System.out.println("Host desconhecido");
            } catch (IOException ex) {
                System.out.println("Erro na conexao: " + ex.getMessage());
            }
    }
}
