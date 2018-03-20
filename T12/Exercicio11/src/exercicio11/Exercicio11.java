/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner inputFromUser = new Scanner(System.in);
        inputFromUser.useLocale(Locale.US);
        Empregado emp = new Empregado();
        
        System.out.println("Digite um nome para um empregado");
        emp.setNome(inputFromUser.nextLine());
        
        System.out.println("Digite um salario");
        emp.setSalario(inputFromUser.nextDouble());
        
        System.out.println("Digite um percentual para ser aumentado");
        emp.aumentaSalario(inputFromUser.nextDouble());
        
        System.out.println("Nome: " + emp.getNome());
        System.out.println("Salario: " + emp.getSalario());
        
    }
}
