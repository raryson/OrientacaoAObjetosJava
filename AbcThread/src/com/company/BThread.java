package com.company;

public class BThread extends Thread{

    private Thread _t;

    public BThread(Thread t){
        _t = t;
    }

    @Override
    public void run()
    {

            try {
                _t.join();
                System.out.println("B");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




    }
}
