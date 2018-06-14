package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pedido p1 = new Pedido("Churros", 20);
        Pedido p2 = new Pedido("Churrasco", 30);
        Pedido p3 = new Pedido("Refri", 5);

        Mesa m1 = new Mesa(1, "Joaquim");
        m1.novoPedido(p1);

        Mesa m2 = new Mesa(2, "Mariana");
        m2.novoPedido(p1);
        m2.novoPedido(p2);

        Mesa m3 = new Mesa(3, "Joana");
        m3.novoPedido(p1);
        m3.novoPedido(p2);
        m3.novoPedido(p3);

        Restaurante r1 = new Restaurante();
        r1.chegaCliente(m1);
        r1.saiCliente(m1);

        System.out.println("O restaurante 1 lucrou " + r1.getFaturamento());

        Restaurante r2 = new Restaurante();
        r2.chegaCliente(m1);
        r2.chegaCliente(m2);
        r2.saiCliente(m2);
        r2.saiCliente(m1);

        System.out.println("O restaurante 2 lucrou " + r2.getFaturamento());

        Restaurante r3 = new Restaurante();
        r3.chegaCliente(m1);
        r3.chegaCliente(m2);
        r3.chegaCliente(m3);
        r3.saiCliente(m2);
        r3.saiCliente(m1);
        r3.saiCliente(m3);

        System.out.println("O restaurante 3 lucrou " + r3.getFaturamento());

    }
}
