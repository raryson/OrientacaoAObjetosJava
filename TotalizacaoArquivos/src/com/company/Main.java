package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput  = new Scanner(System.in);

        System.out.println("Digite um nome de um arquivo pra ve as vogal");
        String nomeDoArquivo  = userInput.nextLine();

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        String linha;

        File file = new File(nomeDoArquivo);

        if(!file.exists())
        {
            System.out.println("O arquivo nao existe");
        }

        try {
            Scanner fileScan = new Scanner(file);
            while(fileScan.hasNext()) {
                linha = fileScan.nextLine();
                linha = linha.toLowerCase();

                int posicaoInicial = 0;

                while(true) {
                    if (linha.indexOf("a", posicaoInicial) != -1) {
                        posicaoInicial = linha.indexOf("a", posicaoInicial);
                        posicaoInicial++;
                        contadorA++;
                    } else {
                        break;
                    }
                }

                posicaoInicial = 0;
                while(true)
                {
                    if(linha.indexOf("e", posicaoInicial) != -1)
                    {
                        posicaoInicial = linha.indexOf("e", posicaoInicial);
                        posicaoInicial++;
                        contadorE++;
                    }else{
                        break;
                    }
                }

                posicaoInicial = 0;
                while(true)
                {
                    if(linha.indexOf("i", posicaoInicial) != -1)
                    {
                        posicaoInicial = linha.indexOf("i", posicaoInicial);
                        posicaoInicial++;
                        contadorI++;
                    }else{
                        break;
                    }
                }

                posicaoInicial = 0;
                while(true)
                {
                    if(linha.indexOf("o", posicaoInicial) != -1)
                    {
                        posicaoInicial = linha.indexOf("o", posicaoInicial);
                        posicaoInicial++;
                        contadorO++;
                    }else{
                        break;
                    }
                }

                posicaoInicial = 0;
                while(true)
                {
                    if(linha.indexOf("u", posicaoInicial) != -1)
                    {
                        posicaoInicial = linha.indexOf("u", posicaoInicial);
                        posicaoInicial++;
                        contadorU++;

                    }else {
                        break;
                    }
                }


            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }

        System.out.println("SEGUE AS VOGAIS");
        System.out.println("Tem " + contadorA + " A");
        System.out.println("Tem " + contadorE + " E");
        System.out.println("Tem " + contadorI + " I");
        System.out.println("Tem " + contadorO+ " O");
        System.out.println("Tem " + contadorU + " U");


    }
}
