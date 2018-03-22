/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

/**
 *
 * @author Raryson
 */
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tamagoshi t1 = new Tamagoshi("Claudinho", 50, 100, 2);
        System.out.println("O nome do Tamagoshi e " + t1.getNome());
        System.out.println("A fome do " + t1.getNome() + " e " + t1.getFome());
        System.out.println("A saude do " + t1.getNome() + " e " + t1.getSaude());
        System.out.println("A idade do " + t1.getNome() + " e " + t1.getIdade());
        System.out.println("O humor do " + t1.getNome() + " e " + t1.getHumor());
        
    }
    
}
