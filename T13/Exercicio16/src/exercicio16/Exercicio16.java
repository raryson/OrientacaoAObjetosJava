/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio16;

/**
 *
 * @author Raryson
 */
public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Vermelho", 1.0);
        
        c1.AumentarAVelocidade(100);
        System.out.println("A velocidade do carro e " + c1.getVelocidade());
        c1.DiminuirAVelocidade(100);
        System.out.println("A velocidade do carro e " + c1.getVelocidade());
        c1.AumentarAVelocidade(1000);
        System.out.println("A velocidade do carro e " + c1.getVelocidade());
        
    }
    
}
