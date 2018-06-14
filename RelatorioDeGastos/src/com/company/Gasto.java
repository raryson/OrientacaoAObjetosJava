package com.company;

import java.util.Calendar;

public class Gasto{

    private double valor;
    private int mes;
    private String descricao;

    public Gasto(double valor, int mes, String descricao)
    {
        this.valor = valor;
        this.mes = mes;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
