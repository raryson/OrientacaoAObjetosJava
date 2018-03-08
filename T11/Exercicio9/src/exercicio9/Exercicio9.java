/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputFromuser = new Scanner(System.in);
        
        int contador = 0;
        String respostaDoUsuario;
        
        System.out.println("Telefonou para a vitima?");
        
        if("Sim".equals(inputFromuser.nextLine()))
            contador++;
        
        System.out.println("Esteve no local do crime?");
        
        if("Sim".equals(inputFromuser.nextLine()))
            contador++;
        
        System.out.println("Mora perto da vitima?");
        
        if("Sim".equals(inputFromuser.nextLine()))
            contador++;
        
        System.out.println("Devia para a vitima?");
        
        if("Sim".equals(inputFromuser.nextLine()))
            contador++;
        
        System.out.println("Ja trabalhou para a vitima?");
        
        if("Sim".equals(inputFromuser.nextLine()))
            contador++;
        
        if(contador >= 3 && contador < 5)
            System.out.println("Cumplice");
        
        if(contador == 2)
            System.out.println("Suspeita");
        
        if(contador == 5)
            System.out.println("Culpado");
        
        if(contador == 1)
            System.out.println("Inocente");
    }
    
}
