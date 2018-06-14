package com.company;

import java.util.ArrayList;

public class GerenciamentoDeProdutos {

    private ArrayList<Produto> produtos;

    public ArrayList<Produto> getProdutos()
    {
        return this.produtos;
    }

    public GerenciamentoDeProdutos()
    {
        this.produtos = new ArrayList<>();
    }

    public void Cadastro(Produto produto)
    {
        this.produtos.add(produto);
    }

    public void Remocao(String codigo)
    {
        for(Produto produto : produtos)
        {
            if(produto.getCodigo() == codigo)
            {
                this.produtos.remove(produto);
            }
        }

    }

    public void Edicao(String codigo, Produto produtoNovo)
    {
        for(Produto produto : produtos)
        {
            if(produto.getCodigo() == codigo)
            {
                this.produtos.remove(produto);
                this.produtos.add(produtoNovo);
            }
        }

    }

    public Produto ExibeProduto(String codigo) throws Exception {
        for(Produto produto : produtos)
        {
            if(produto.getCodigo() == codigo)
            {
                return produto;
            }
        }

        throw new Exception();
    }
}
