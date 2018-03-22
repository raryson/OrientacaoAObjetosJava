/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

/**
 *
 * @author Raryson
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Porta p1 = new Porta();
        
        p1.abre();
        System.out.println("A porta esta " + p1.estaAberta());
        
        p1.pinta("Vermelho");
        System.out.println("A porta e " + p1.getCor());
        
        p1.fecha();
        System.out.println("A porta esta "+ p1.estaAberta());
        
        p1.pinta("Azul");
        System.out.println("A porta e " + p1.getCor());
        
        p1.abre();
        System.out.println("A porta esta " + p1.estaAberta());
    }
    
}
