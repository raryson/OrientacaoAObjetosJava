package com.company;

public class CThread extends Thread {

    private Thread _t;
    private Thread _d;

    public CThread(Thread t, Thread d){
        _t = t;
        _d = d;
    }


    @Override
    public void run()
    {

            try {
                _t.join();
                _d.join();
                System.out.println("C");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




    }
}
