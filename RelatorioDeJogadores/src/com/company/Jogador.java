package com.company;

/*e na classe de jogador existe a posição, o valor da bonificação, o valor da gratificação e
as informações para cálculo do índice de massa corporal (peso e altura).*/

public class Jogador extends Funcionario implements ISalario{

    public Jogador(String posicao, double valorDaBonificacao, double valorDaGratificacao, double peso,
                   double altura, String nome, String matricula, double salarioBase)
    {
        super(matricula, nome, salarioBase);
        this.posicao = posicao;
        this.valorDaGratificacao = valorDaGratificacao;
        this.valorDaBonificacao = valorDaBonificacao;
        this.altura = altura;
        this.peso = peso;
    }

    private String posicao;
    private double valorDaBonificacao;
    private double valorDaGratificacao;
    private double peso;
    private double altura;

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getValorDaBonificacao() {
        return valorDaBonificacao;
    }

    public void setValorDaBonificacao(double valorDaBonificacao) {
        this.valorDaBonificacao = valorDaBonificacao;
    }

    public double getValorDaGratificacao() {
        return valorDaGratificacao;
    }

    public void setValorDaGratificacao(double valorDaGratificacao) {
        this.valorDaGratificacao = valorDaGratificacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularSalario()
    {
        return (this.getSalarioBase() * 2) + (this.valorDaBonificacao) + this.valorDaGratificacao;
    }

    public double IMC()
    {
        return this.peso / (this.altura * this.altura);
    }
}
