package com.company;

public class Pong extends Thread{

    private Thread _ping;

    public Pong(Thread ping)
    {
        _ping = ping;
    }

    @Override
    public void run()
    {
        try {
            _ping.join();
            while(true)
            {
                System.out.println("Pong");
                _ping.run();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
