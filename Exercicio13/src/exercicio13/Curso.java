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
public class Curso {
    
    private int numero;
    private String nome;
    private Professores professor;
    
    public Curso(int _numero, String _nome, Professores _professor)
    {
        this.numero = _numero;
        this.nome = _nome;
        this.professor = _professor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Professores getProfessor() {
        return professor;
    }
    
    public void exibeDados()
    {
        System.out.println("O nome do curso e: " + getNome());
        System.out.println("O numero do curso e: " + getNumero());
        System.out.println("O nome do professor desse curso e: " + getProfessor().getNome());
        System.out.println("O numero do professor desse curso e: " + getProfessor().getNumero());
    }
    
    
}
