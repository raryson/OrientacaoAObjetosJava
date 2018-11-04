package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite uma palavra com todas letras maiusculas");

        String userInputedString = userInput.next();

        try{
            StringMaiuscula.VerificaMaiuscula(userInputedString);
        }
        catch(NotLetterCharacterOnStringException ex)
        {
            System.out.println("Na string contem coisas que nao sao letras");
        }
        catch(NotUpcaseCharacterOnStringException ex)
        {
            System.out.println("Nao tem character maiusculo");
        }

    }
}
