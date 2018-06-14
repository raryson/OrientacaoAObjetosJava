package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Produto p1 = new Produto("aaac", "Cerveja", 5, 200);
        Produto p2 = new Produto("aaaab", "Carne", 30, 1000);
        Produto p3 = new Produto("514asb", "Mandioca", 2, 10000);

        GerenciamentoDeProdutos estoque = new GerenciamentoDeProdutos();
        estoque.Cadastro(p1);
        estoque.Cadastro(p2);
        estoque.Cadastro(p3);


        Venda venda = new Venda("07/01/1996", 3);

        venda.adicionaProdutosNaLista(p1);
        venda.adicionaProdutosNaLista(p2);

        try {
            venda.fecharVendas(estoque);
        } catch (Exception e) {
            e.printStackTrace();
        }


        for(Produto produto : estoque.getProdutos())
        {
            System.out.println("A quantidade de " + produto.getDescricao() + " e " + produto.getQuantidadeEmEstoque());
        }

    }
}
