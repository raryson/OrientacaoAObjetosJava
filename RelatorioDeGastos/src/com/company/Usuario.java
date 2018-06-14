package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormatSymbols;
import java.util.TreeMap;
import java.util.zip.DataFormatException;

public class Usuario implements IExibido, ICalcula {

    private String nome;
    private Contatos contatos;
    private TreeMap<Integer, ArrayList<Gasto>> gastos;
    private ArrayList<Gasto> listaDeGastos;

    public Usuario(String nome, Contatos contatos)
    {
        this.nome = nome;
        this.contatos = contatos;
        this.gastos = new TreeMap<Integer, ArrayList<Gasto>>();
    }

    public void exibeRelatorio(){

        System.out.println("Nome: " + this.nome + "(" + this.contatos.getEmail() + " / " + this.contatos.getCelular() + ")");
        System.out.println("Gastos do primeiro semestre = R$" + calculaGastosTotais());

        for(int chave : this.gastos.keySet())
        {
            System.out.println("- " + new DateFormatSymbols().getMonths()[chave] + " = " + calculaGastoComBaseNoMes(chave));
            mostraGastosDoMes(chave);
        }
    }

    public void mapeiaMes(int mes)
    {
        this.gastos.put(mes, this.listaDeGastos);
    }

    public void comecaNovoMes()
    {
        this.listaDeGastos = new ArrayList<Gasto>();
    }

    public void incluirGasto(Gasto gasto)
    {
        this.listaDeGastos.add(gasto);
    }

    private double calculaGastosTotais()
    {
        double valor = 0;

        for(Integer chave : this.gastos.keySet())
        {
            for(Gasto gasto : this.gastos.get(chave))
            {
                valor += gasto.getValor();
            }
        }

        return valor;
    }


    private double calculaGastoComBaseNoMes(int mes)
    {
        double valor = 0;

       for(Gasto gasto : this.gastos.get(mes))
       {
           valor += gasto.getValor();
       }

        return valor;
    }

    private void mostraGastosDoMes(int mes)
    {
        for(Gasto gasto : this.gastos.get(mes))
        {

            System.out.println("--- " + gasto.getDescricao() + " - " + "R$ " + gasto.getValor());

        }
    }


}
