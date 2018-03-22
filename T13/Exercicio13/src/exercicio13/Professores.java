/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

/**
 *
 * @author Raryson
 */
public class Professores {
    
    private String nome;
    private int numero;
    
    public Professores(String _nome, int _numero)
    {
        this.nome = _nome;
        this.numero = _numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
