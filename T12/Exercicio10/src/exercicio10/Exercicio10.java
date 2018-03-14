/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author Raryson
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data = new Data();
        data.setAno(1997);
        data.setDia(8);
        data.setMes(1);
        
        System.out.println(data.mostraData());
        
        Data data2 = new Data();
        data2.setAno(2020);
        data2.setDia(12);
        data2.setMes(12);
        
        System.out.println(data2.mostraData());
        
        Data data3 = new Data();
        data3.setAno(2000);
        data3.setDia(3);
        data3.setMes(6);
        
        System.out.println(data3.mostraData());
    }
    
}
