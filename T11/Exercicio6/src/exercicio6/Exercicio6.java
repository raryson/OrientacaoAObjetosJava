/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numberInputedFromUser, contador = 0, somaDosImpares = 0;
        
        Scanner inputFromUser = new Scanner(System.in);
        
        System.out.println("Digite um numero para ser calculado a soma dos impares ate ele, nao pode ser 0 e nem negativos");
        numberInputedFromUser = inputFromUser.nextInt();
   
        if(numberInputedFromUser <= 0 )
        {
            System.out.println("O numero nao pode ser negativo e nem menor que zero");
            System.exit(1);
        }
        
        for(; contador <= numberInputedFromUser; contador++)
        {
            if(contador % 2 != 0)
            {
                somaDosImpares += contador;
            }
        }
        
        System.out.println("A soma dos numeros ate o numero digitado e " + somaDosImpares);
    }
    
}
