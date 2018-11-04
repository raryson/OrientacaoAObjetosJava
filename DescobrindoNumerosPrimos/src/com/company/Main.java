package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Primos pr = new Primos(2);
        ArrayList<Integer> ultimosPrimosEncontrados = new ArrayList<>();

        int contador = 0;
        while(contador < 999999)
        {
            pr.run();

            try {
                pr.join();
                Primos newPrimo = new Primos(pr.getUltimoPrimoEncontrado());
                newPrimo.run();
                newPrimo.join();
                ultimosPrimosEncontrados = newPrimo.getTotalPrimos();
                contador++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Os ultimos primos encontrados foram");
        Collections.sort(ultimosPrimosEncontrados);
        for(Integer i :  ultimosPrimosEncontrados)
        {
            System.out.print(i + " ");
        }
    }


}
