/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacotche;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class MatrizQuadradaUsuario {

    /**
     * @param args the command line arguments
     * Faça um programa em Java que solicite ao usuário a dimensão de uma matriz quadrada de valores
     * inteiros.
Após, solicite ao usuário o valor de cada uma das posições.
Por fim, calcule:

A soma dos valores da diagonal principal
O produto dos valores da diagonal secundária
A soma dos valores que não estão nas posições das diagonais

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        int length;
        
        System.out.println("Digite o valor do tamanho da sua matriz");
        length = userInput.nextInt();
        
        int matriz[][] =  new int[length][length];
      
        int contadorX = 0, contadorY;
        
        for(int[] valor : matriz)
        {
            contadorY  = 0;
        
            for(int valorIterado : valor)
            {
               
                System.out.println("Digite um valor para preencher a matriz na posicao: ["+ contadorX +"]["+contadorY +"]");
                matriz[contadorX][contadorY] = userInput.nextInt();
                
                contadorY++;
            }
            
            contadorX++;
        }
        
        
      
        
        
    }
    
}
