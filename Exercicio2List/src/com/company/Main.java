package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);

        String nomeDigitado, nomeASerBuscado;
        int cont = 0;

        ArrayList<String> stringList = new ArrayList<String>();

        for(; cont<10; cont++)
        {
            System.out.println("Digite um nome para ser inserido na lista");
            nomeDigitado = userInput.nextLine();
            stringList.add(nomeDigitado);
        }

        System.out.println("Digite um nome para ser buscado na lista");
        nomeASerBuscado = userInput.nextLine();

        if(stringList.contains(nomeASerBuscado))
        {
            System.out.println("Existe o nome na lista");
        }
        else
        {
            System.out.println("Nao existe o nome na lista");
        }


    }
}
