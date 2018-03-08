/*0
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;
/**
 *
 * @author Raryson
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner inputFromUser = new Scanner(System.in);
        
        System.out.println("Digite um valor para ser calculado, lembrando que o valor precisa ser inteiro");
        
        int inputedFirstValue = inputFromUser.nextInt();
        
        System.out.println("Digite um outro valor para ser calculado, lembrando que o valor precisa ser inteiro");
    
        int inputedSecondValue = inputFromUser.nextInt();
        
        System.out.println("Soma = " + MakeSum(inputedFirstValue, inputedSecondValue));
        System.out.println("Subtracao = " + MakeSubtract(inputedFirstValue, inputedSecondValue));
        System.out.println("Multiplicacao = " + MakeMultiplication(inputedFirstValue, inputedSecondValue));
        
        if(!ValidateSecondInputedValue(inputedSecondValue))
        {
            System.out.println("Divisao = Impossivel dividir por zero");
        }
        else
        {
            System.out.println("Divisao = " + MakeDivision(inputedFirstValue, inputedSecondValue));
        }
        
        System.exit(0);
    }
    
    private static boolean ValidateSecondInputedValue(int inputedValue)
    {
        if(inputedValue == 0)
        {
            return false;
        }
        return true;
    }
    
    
    private static int MakeSum(int firstValueToSum, int secondValueToSum)
    {
        return firstValueToSum + secondValueToSum;
    }
    
    private static int MakeMultiplication(int firstValueToMultiplication, int secondValueToMultiplication)
    {
        return firstValueToMultiplication * secondValueToMultiplication;
    }
    
    private static int MakeDivision(int firstValueToDivison, int secondValueToDivision)
    {
        
        return firstValueToDivison / secondValueToDivision;
    }

    private static int MakeSubtract(int firstValueToSubtract, int secondValueToSubtract)
    {
        return firstValueToSubtract - secondValueToSubtract;
    }
}
