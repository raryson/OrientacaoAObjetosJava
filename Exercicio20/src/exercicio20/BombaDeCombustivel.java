/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20;

/**
 *
 * @author Raryson
 * 
- tipoDeCombustivel (String).
- valorPorLitro (double)
- quantidadeDeCombustivel (double) - quantidade de combustível disponível na bomba para abastecimento
 */
public class BombaDeCombustivel {
    
    private String tipoDeCombustivel;
    private double valorPorLitro;
    private double quantidadeDeCombustivel;
    
    public double abastecePorValor(double valor)
    {
        if(valor <= 0)
        {
            System.out.println("Nao da pra abastecer com valor negativo");
            return 0;
        }
        
        double quantidadeASerAbastecida = valor/this.valorPorLitro;

        if(quantidadeASerAbastecida <= 0)
        {
            System.out.println("Nao existe combustivel suficiente na bomba");
            return 0;
        }
        
        this.quantidadeDeCombustivel -= quantidadeASerAbastecida;
        
        return quantidadeASerAbastecida;
    }
    
    public double abastecePorLitro(double quantidade)
    {
        if(quantidade <= 0)
        {
            System.out.println("Nao da pra abastecer com valor negativo");
            return 0;
        }
        
        double valorASerAbastecido = quantidade * this.valorPorLitro;

        if(valorASerAbastecido <= 0)
        {
            System.out.println("Nao da pra abastecer um valor negativo");
            return 0;
        }
        
        this.quantidadeDeCombustivel -= quantidade;
        
        return valorASerAbastecido;
    }

    public double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }
    
    
}
