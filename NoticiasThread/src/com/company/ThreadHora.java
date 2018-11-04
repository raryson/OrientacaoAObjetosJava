package com.company;

import java.util.Calendar;


public class ThreadHora extends Thread {

    @Override
    public void run()
    {
        int contador = 0;
        while(contador < 5)
        {
            try {
                this.sleep(10000);
                contador++;
                System.out.println(Calendar.getInstance().getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
