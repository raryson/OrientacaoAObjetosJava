package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner userInput = new Scanner(System.in);
        int[] intAarray = new int[10];
        int counter = 0, userInputedNumber;

        for(; counter < 10; counter++)
        {
            intAarray[counter] = counter;
        }

        System.out.println("Digite uma posicao para printar do array");

        try
        {
            System.out.println("O numero da posicao printada e " + intAarray[userInput.nextInt()]);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("A posicao buscada nao foi encontrada no array");
        }

    }
}
