package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AThread a = new AThread();
        BThread b = new BThread(a);
        CThread c = new CThread(a, b);


        c.start();
        a.start();
        b.start();


    }
}
