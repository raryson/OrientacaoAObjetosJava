/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int inputedValueFromuser;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Digite um numero para aparecer um numero da semana, exemplo: 1 - Domingo");
        inputedValueFromuser = userInput.nextInt();
        
        switch(inputedValueFromuser)
        {
            case 1:
            {
                System.out.println("Domingo");
                break;
            }
            
            case 2:
            {
                System.out.println("Segunda-Feira");
                break;
                
            }
            
            case 3:
            {
                System.out.println("Terca-Feira");
                break;
            }
            
            case 4:
            {
                System.out.println("Quarta-Feira");
                break;
                
            }
            
            case 5:
            {
                System.out.println("Quinta-Feira");
                break;
            }
            
            case 6:
            {
                System.out.println("Sexta-Feira");
                break;
            }
            
            case 7:
            {
                System.out.println("Sabado");
                break;
            }
            
            default :
            {
                System.out.println("Dia invalido");
                System.out.println("Demais dias");
                System.out.println("1 - Domingo");
                System.out.println("2 - Segunda");
                System.out.println("3  - Terca");
                System.out.println("4 - Quarta");
                System.out.println("5 - Quinta");
                System.out.println("6 - Sexta");
                System.out.println("7 - Sabado");
            }
           
            
        }
        
        
    }
    
}
