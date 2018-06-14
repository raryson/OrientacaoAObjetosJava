package com.company;

// matrícula, nome e salário base.

public abstract class Funcionario {

    public Funcionario(String matricula, String nome, double salarioBase)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    private String matricula;

    private String nome;

    private double salarioBase;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
