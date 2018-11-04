package com.company;

//Crie uma classe Turma, que possui como atributos PRIVADOS nome:String, numero:int e uma Lista de Aluno.
//Implemente os métodos getters e setters dos atributos, além dos métodos:

//adicionaAluno - Adiciona um aluno na Turma
//listaAlunos - Exibe o nome e o número da turma e o nome e número de todos os alunos da turma


import java.util.ArrayList;

public class Turma {

    private String nome;
    private int numero;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void setNomeDisciplina(String nome) {
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

    public void adicionaAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
    }

    public void listaAlunos()
    {
        System.out.println(this.nome + " - " + this.numero);
        for(Aluno aluno : this.alunos)
        {
            System.out.println(aluno.getNome() + " - " + aluno.getNumero());
        }
    }
}
