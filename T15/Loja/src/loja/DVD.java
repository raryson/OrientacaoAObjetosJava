/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Raryson
 */
public class DVD extends Item {
    
    private double duracao;
    
    public DVD(String nome, double valor, double duracao)
    {
        super(nome, valor);
        this.duracao = duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    public double getDuracao() {
        return duracao;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nDuracao: " + getDuracao();
    }
    
}
