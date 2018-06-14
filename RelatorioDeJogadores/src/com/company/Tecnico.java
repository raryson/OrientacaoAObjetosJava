package com.company;

public class Tecnico extends Funcionario implements  ISalario{

    public Tecnico(String nome, String matricula, double salarioBase, int quantidadeDeTitulos)
    {
        super(matricula, nome, salarioBase);
        this.quantidadeDeTitulos = quantidadeDeTitulos;
    }

    private int quantidadeDeTitulos;

    public int getQuantidadeDeTitulos() {
        return quantidadeDeTitulos;
    }

    public void setQuantidadeDeTitulos(int quantidadeDeTitulos) {
        this.quantidadeDeTitulos = quantidadeDeTitulos;
    }

    public double calcularSalario()
    {

        return (this.getSalarioBase() * 2) + (this.quantidadeDeTitulos * 250);
    }
}