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
public class CalculaPrimos   {
        
        private boolean CalculaPrimo()
        {
            int numberInputedFromUser, contador = 0, isPrimo = 0, internalCounter, somaDosPrimos = 0;

            Scanner inputFromUser = new Scanner(System.in);

            System.out.println("Digite um numero para ser calculado a soma dos primos ate ele, nao pode ser 0 e nem negativos");
            numberInputedFromUser = inputFromUser.nextInt();


            for(contador = 1; contador < numberInputedFromUser; contador++)
            {
                for(internalCounter = 1; internalCounter < contador; internalCounter++)
                {
                    if(contador % internalCounter == 0)
                    {
                        isPrimo++;
                    }

                }
                if(isPrimo == 1)
                {
                    somaDosPrimos += contador;
                }
                System.out.println("A soma dos primos ate o numero informado e " + somaDosPrimos);
                isPrimo = 0;


            }
            
            return true;
        }
}
