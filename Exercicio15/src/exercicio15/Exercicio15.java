/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;

/**
 *
 * @author Raryson
 */
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Casa c1 = new Casa();
        Porta p1 = new Porta();
        Porta p2 = new Porta();
     
    
        c1.pinta("Vermelha");
        c1.setPorta1(p1);
        c1.setPorta2(p2);
        
        
  
        
        p2.abre();
        p1.abre();
        
        System.out.println("A quantidade de portas instaladas e " + c1.totalDePortasInstaladas());
        System.out.println("O numero de portas abertas e " + c1.quantasPortasEstaoAbertas() );
        
    }
    
}
