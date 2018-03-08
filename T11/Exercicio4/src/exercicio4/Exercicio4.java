/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputedValue = new Scanner(System.in);
        System.out.println("Digite a largura");
        int width = inputedValue.nextInt();
        
        System.out.println("Digite a altura do quadrado");
        int height = inputedValue.nextInt();
        
        for(int x = 0, y = 0; height > x; x++){
            System.out.println();
            
            for (y = 0; width > y; y++) {
                System.out.print("x");
            }
        }
        
        System.out.println();
    }
    
}
