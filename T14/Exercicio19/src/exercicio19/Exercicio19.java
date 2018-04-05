/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

/**
 *
 * @author Raryson
 */
public class Exercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Ponto p1 = new Ponto(0, 5);
        Ponto p2 = new Ponto(2, 7);
        Ponto p3 = new Ponto(8 , 10);
        
        Retangulo r1 = new Retangulo(2, 6, p1);
        Retangulo r2 = new Retangulo(6, 8, p2);
        Retangulo r3 = new Retangulo(8, 10, p3);
        
        
        r1.getCentro().imprimeValores();
        r2.getCentro().imprimeValores();
        r3.getCentro().imprimeValores();
        
        
    }
    
}
