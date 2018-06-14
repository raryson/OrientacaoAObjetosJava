package com.company;

import java.util.ArrayList;

public class Mesa {
    private int numero;
    private String cliente;
    private ArrayList<Pedido> pedidos;

    public Mesa(int numero, String cliente)
    {
        this.numero = numero;
        this.cliente = cliente;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void novoPedido(Pedido novoPedido)
    {
        this.pedidos.add(novoPedido);
    }

    public ArrayList<Pedido> mostraPedidos()
    {
        return this.pedidos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
