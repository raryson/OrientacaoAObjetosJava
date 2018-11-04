package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ping ping = new Ping();
        Pong pong = new Pong(ping);

        ping.run();
        pong.run();

    }
}
