/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20;

/**
 *
 * @author Raryson
 */
public class Exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BombaDeCombustivel b1 = new BombaDeCombustivel();
        
        b1.setQuantidadeDeCombustivel(100);
        b1.setTipoDeCombustivel("GNV");
        b1.setValorPorLitro(2);        
        System.out.println("Abasteci por litro e gastei: " + b1.abastecePorLitro(20));
        System.out.println("Agora tem " + b1.getQuantidadeDeCombustivel() + " litros de combustivel");
        System.out.println("Agora vou abastecer por gasolina coloquei 40 reais, rendeu : " + b1.abastecePorValor(40) + " litros");
        System.out.println("Agora tem " + b1.getQuantidadeDeCombustivel() + " litros de combustivel");
    }
    
}
