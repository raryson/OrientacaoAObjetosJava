/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

/**
 *
 * @author Raryson
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Professores p1 = new Professores("Tales", 12);
        Professores p2 = new Professores("Elgio", 13);
        
        Curso c1 = new Curso(1, "Orientacao a Objetos", p1);
        Curso c2 = new Curso(2, "Redes 1", p2);
        Curso c3 = new Curso(3, "Algoritmos 3", p2);
        
        System.out.println("Curso 1");
        c1.exibeDados();
        
        System.out.println("Curso 2");
        c2.exibeDados();
        
        System.out.println("Curso 3");
        c3.exibeDados();
        
    }
    
}
