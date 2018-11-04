package com.company;

import java.io.Serializable;

public class Aluno implements Serializable {

    private String nome;
    private double g1;
    private double g2;

    public Aluno(String nome, double g1, double g2)
    {
        this.nome = nome;
        this.g1 = g1;
        this.g2 = g2;
    }

    public String getNome() {
        return nome;
    }

    public double getG1() {
        return g1;
    }

    public double getG2() {
        return g2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setG1(double g1) {
        this.g1 = g1;
    }

    public void setG2(double g2) {
        this.g2 = g2;
    }
}
