/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

import java.util.Scanner;

/**
 *
 * @author Raryson
 */
public class Main {

    /**
     * @param args the command line arguments
     * Crie uma classe de testes que perguntará ao usuário o tipo de Lâmpada a ser criado.
     * Após, manda a fábrica criar a lâmpada LED ou Fluorescente, de acordo com o usuário,
     * manda ligar, mostra o estado e manda desligar, mostrando o estado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        char tipoDeLampada;
        
        System.out.println("Que tipo de lampada voce deseja criar? L para LED e F para Fluorecente");
        tipoDeLampada = userInput.next().charAt(0);
        
        FabricaDeLampadas f1 = new FabricaDeLampadas();
        Lampada l1 = f1.criarLamapada(tipoDeLampada);
        
        System.out.println("O estado da lampada e: " + l1.mostraEstado());
        l1.Ligar();
        
        System.out.println("O estado da lampada e: " + l1.mostraEstado());
        l1.Desligar();
        
        System.out.println("O estado da lampada e: " + l1.mostraEstado());
    }
    
}
