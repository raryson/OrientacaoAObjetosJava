package com.company;

//: o nome, uma lista de jogadores, o técnico e uma lista de títulos.
//a. Use “List” para os jogadores e use “Set” para os títulos

import java.util.ArrayList;
import java.util.TreeSet;

public class Time implements IExibicao{

    public Time(String nome, ArrayList<Jogador> jogadores, TreeSet<Titulo> titulos, Tecnico tecnico)
    {
        this.tecnico = tecnico;
        this.jogadores = jogadores;
        this.nome = nome;
        this.titulos = titulos;
    }

    private String nome;
    private ArrayList<Jogador> jogadores;
    private TreeSet<Titulo> titulos;
    private Tecnico tecnico;

    public void exibeRelatorioCadastral()
    {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Jogadores");

        for(Jogador jog : jogadores)
        {
            System.out.println("- "+jog.getMatricula() + " - " + jog.getNome() + " (" + jog.getPosicao() + ")");

            System.out.println("... Salario  = " + jog.calcularSalario() + " Salario Base: "+ jog.getSalarioBase()
                    + "; Bonificacao: "
                    + jog.getValorDaBonificacao() + "; Gratificacao: " + jog.getValorDaGratificacao() + ")");

            System.out.println("... IMC = " + jog.IMC() + " (Peso: " + jog.getPeso() + "; Altura: " + jog.getAltura() + ")");
        }

        System.out.println("Tecnico " + this.tecnico.getNome() + " ("+ this.tecnico.getMatricula() + " - " +
                this.tecnico.getNome() + ")" );

        System.out.println("... Salario = " + this.tecnico.calcularSalario() + " (Salario Base: "
                + this.tecnico.getSalarioBase() + "; Titulos: " + this.tecnico.getQuantidadeDeTitulos());

        System.out.println("Titulos");

        for(Titulo tit : titulos)
        {
            //- 2001 : Copa do Brasil
            System.out.println("- " + tit.getAnoDoTitulo() + " : " + tit.getDesccricao());
        }
    }

}
