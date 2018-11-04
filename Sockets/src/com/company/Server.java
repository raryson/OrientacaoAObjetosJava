package com.company;

import java.util.*;
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        // write your code here
        try {

            ServerSocket server = new ServerSocket(6543);
            Socket s = server.accept();


            Scanner entrada = new Scanner(new InputStreamReader(s.getInputStream()));
            PrintWriter saida = new PrintWriter(s.getOutputStream());
            while(true)
            {
                String linha;
                while ((linha = entrada.nextLine()).length() != 0) {
                    System.out.println(linha);
                }
                saida.println("PEPO\n");
                saida.flush();
            }


        } catch (UnknownHostException ex) {
            System.out.println("Host desconhecido");
        } catch (IOException ex) {
            System.out.println("Erro na conexao: " + ex.getMessage());
        }
    }
}
