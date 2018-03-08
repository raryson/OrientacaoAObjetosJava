/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputedValueFromUser = new Scanner(System.in);
        
        System.out.println("Digite um valor para ser somado");
        int firstInputedValue = inputedValueFromUser.nextInt();
        
        
        System.out.println("Digite um valor para ser somado");
        int secondInputedValue = inputedValueFromUser.nextInt();
        
        if(firstInputedValue == 0 && secondInputedValue == 0)
        {
            System.out.println("E par");
            System.exit(0);
        }
        
        if(firstInputedValue % secondInputedValue == 0){
            System.out.println("E par");
        }
        else
        {
            System.out.println("E impar");
        }
            
        
        
        
    }
    
}
