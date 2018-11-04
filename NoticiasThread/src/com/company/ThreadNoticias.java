package com.company;

import java.util.Random;
import java.util.ArrayList;

public class ThreadNoticias extends Thread {

    public ThreadNoticias()
    {
        for(int contador = 0; contador < 10; contador++)
            this.noticias.add("Gremio ganhou dia " + (contador+1));
    }

    private ArrayList<String> noticias = new ArrayList();


    @Override
    public void run()
    {
        Random gerador = new Random();

        while(true)
        {
            try {
                System.out.println(noticias.get(gerador.nextInt(10)));
                this.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
