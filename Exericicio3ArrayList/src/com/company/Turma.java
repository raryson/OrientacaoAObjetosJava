package com.company;

import java.util.ArrayList;

public class Turma {

    private String nome;
    private int numero;
    private ArrayList<Aluno> alunos;

    public Turma()
    {
        this.alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public void setNomeDisciplina(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void adicionaAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
    }

    public void listaAlunos()
    {
        System.out.println(this.getNome() + " - " + this.getNumero());
        for(Aluno aluno : this.alunos)
        {
            System.out.println(aluno.getNome() + " - " + aluno.getNumero());

        }
    }
}
