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
public class Livros extends Item {
    
    private String autor;


    public Livros(String nome, String autor, double preco)
    {
        super(nome, preco);
        this.autor = autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    
    @Override
    public String toString()
    {
        return super.toString() + "\nAutor: " + this.getAutor();
    }
    
}
