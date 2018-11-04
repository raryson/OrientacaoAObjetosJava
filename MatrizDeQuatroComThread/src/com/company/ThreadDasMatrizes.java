package com.company;

public class ThreadDasMatrizes extends Thread{

    private int[] meuArray;
    private int soma;

    public int getSoma() {
        return soma;
    }

    public ThreadDasMatrizes(int[] meuArray)
    {
        this.meuArray = meuArray;
    }

    @Override
    public void run()
    {
        for(int contador = 0; contador < meuArray.length; contador++)
        {
            soma += meuArray[contador];
        }
        System.out.println(soma);
    }
}
