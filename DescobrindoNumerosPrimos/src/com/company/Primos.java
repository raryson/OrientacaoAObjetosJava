package com.company;

import java.util.ArrayList;

public class Primos extends Thread {

    private int contadora;
    private int primeiroPrimo;
    private int ultimoPrimoEncontrado;
    private ArrayList<Integer> totalPrimos = new ArrayList();

    public Primos(int primeiroPrimo)
    {
        this.primeiroPrimo = primeiroPrimo;
    }

    @Override
    public void run()
    {
        contadora = 0;
        while(contadora < 1000)
        {
            primeiroPrimo++;
            if(isPrime(primeiroPrimo))
            {
                ultimoPrimoEncontrado = primeiroPrimo;
                totalPrimos.add(primeiroPrimo);
            }
            contadora++;
        }
    }

    public ArrayList<Integer> getTotalPrimos()
    {
        return this.totalPrimos;
    }

    public int getPrimeiroPrimo() {
        return primeiroPrimo;
    }

    public int getUltimoPrimoEncontrado() {
        return ultimoPrimoEncontrado;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n < 4) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0) {
                return false;
            }
            if (n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
