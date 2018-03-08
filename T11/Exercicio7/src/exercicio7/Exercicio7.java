/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int firstNumber, secondNumber;
        
        Scanner inputFromuser = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        firstNumber = inputFromuser.nextInt();
        
        System.out.println("Digite outro numero");
        secondNumber = inputFromuser.nextInt();
        
        if(firstNumber > secondNumber)
            System.out.println("Primeiro numero maior");
        
        if(secondNumber > firstNumber)
            System.out.println("Segundo numero maior");
        
        if(firstNumber == secondNumber)
            System.out.println("Os numeros sao iguais");
        
        System.exit(0);
        
    }
    
}
