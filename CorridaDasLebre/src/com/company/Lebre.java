package com.company;

import java.util.Random;

public class Lebre extends Thread{

    private int metrosPercorridos;

    public int getMetrosPercoridos()
    {
        return this.metrosPercorridos;
    }

    @Override
    public void run()
    {
        Random r = new Random();
        int metrosPercorridosNessaHora = (r.nextInt(3) + 1);
        System.out.println("A lebre "+ this.getName() +" percorreu " + metrosPercorridosNessaHora);
        metrosPercorridos += metrosPercorridosNessaHora;
        this.yield();

    }
}
