package com.company;

import java.util.ArrayList;

public class Restaurante {

    private double faturamento;
    private ArrayList<Mesa> mesas;

    public Restaurante()
    {
        this.faturamento = 0;
        this.mesas = new ArrayList<Mesa>();
    }

    public void chegaCliente(Mesa mesa)
    {
        this.mesas.add(mesa);
    }

    public void saiCliente(Mesa mesa)
    {
        for(Pedido pedido : mesa.mostraPedidos())
        {
            this.faturamento += pedido.getValor();
        }

        this.mesas.remove(mesa);
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
}
