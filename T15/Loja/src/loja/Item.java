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
public class Item {
    
    private String nome;
    private double preco;
    
    public Item(String nome, double preco)
    {
        this.preco = preco;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + this.getNome() + "\nPreco: " + this.getPreco();
    }
    
}
