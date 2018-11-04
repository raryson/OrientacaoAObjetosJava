package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numberA, numberB;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite um numero");

        numberA = userInput.nextInt();

        System.out.println("Digite um outro numero");

        numberB = userInput.nextInt();

        try
        {
            System.out.println("O resultado da divisao entre os numeros informados e: " + (numberA/numberB));
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }


    }
}
