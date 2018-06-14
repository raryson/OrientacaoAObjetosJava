package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Venda {

    private String data;
    private ArrayList<Produto> produtos;
    private HashMap<Produto, Integer> produtosMap;
    private int quantidade;

    public Venda(String data, int quantidade)
    {
        this.data = data;
        this.produtos = new ArrayList<>();
        this.quantidade = quantidade;
    }

    public void adicionaProdutosNaLista(Produto produto)
    {
        this.produtos.add(produto);
    }

    public void mapeiaProdutos()
    {
        this.produtosMap = new HashMap<>();
        for(Produto produto : this.produtos)
        {
            this.produtosMap.put(produto, produto.getQuantidadeEmEstoque());
        }
    }

    public void fecharVendas(GerenciamentoDeProdutos estoque) throws Exception {
        double valorDaVenda = 0 ;

        for(Produto produto : this.produtos)
        {
            if(estoque.ExibeProduto(produto.getCodigo()).getQuantidadeEmEstoque() < this.quantidade)
            {
                System.out.println("Nao e possivel fazer essa compra, pois nao existe produtos em estoque o suficiente");
                throw new Exception();
            }

            valorDaVenda += produto.getPrecoUnitario() * this.quantidade;

            int quantidadeEmEstoque = estoque.ExibeProduto(produto.getCodigo()).getQuantidadeEmEstoque();
            estoque.ExibeProduto(produto.getCodigo()).setQuantidadeEmEstoque(quantidadeEmEstoque - this.quantidade);

        }

        System.out.println("O valor total da venda foi " + valorDaVenda);

    }


}
