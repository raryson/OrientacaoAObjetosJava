package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> listaDosMongol = new ArrayList<String>();

        for(int contador = 0; contador < 10; contador++)
        {
            listaDosMongol.add("a"+contador);
        }

        System.out.println("Digite um numero para ver na lista");
        if(listaDosMongol.contains(userInput.nextLine()))
        {
            System.out.println("O nome ta na lista");
        }
        else
        {
            System.out.println("O nome nao ta na lista");
        }
    }
}
