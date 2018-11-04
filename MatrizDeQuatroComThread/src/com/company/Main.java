package com.company;

public class Main {
//    Escreva um programa que realize o cálculo das somas dos valores das linhas de uma matriz, de ordem 4,
// de números inteiros e imprima o resultado na tela.
//
//    Faça com que o cálculo do somatório de cada linha seja realizado em paralelo por threads
//
//    A matriz deverá ser definida no programa principal (main). \
// Cada uma das threads deverá ser responsável pelo somatório de apenas uma linha.
//
//    Deve ser impresso o valor da soma de cada linha.
//
//    Deve ser impresso o valor total do somatório (uma única vez)
//
//    Não pode ser usado atributos estáticos


    public static void main(String[] args) {
	    int[][] meuArray = new int [4][4];
	    int [] linha1 = new int[4];
        int [] linha2 = new int[4];
        int [] linha3 = new int[4];
        int [] linha4 = new int[4];

	    for(int contador = 0; contador < meuArray.length; contador++)
	    {
	        for(int contador2 = 0;contador2 < meuArray.length; contador2++)
	        {
	            if(contador == 0)
                    linha1[contador2] = contador;
	            if(contador == 1)
                    linha2[contador2] = contador;
                if(contador == 2)
                    linha3[contador2] = contador;
                if(contador == 3)
                    linha4[contador2] = contador;

	            meuArray[contador][contador2] = contador;
            }

        }

        ThreadDasMatrizes t1 = new ThreadDasMatrizes(linha1);
        ThreadDasMatrizes t2 = new ThreadDasMatrizes(linha2);
        ThreadDasMatrizes t3 = new ThreadDasMatrizes(linha3);
        ThreadDasMatrizes t4 = new ThreadDasMatrizes(linha4);

	    t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int somatorioDaMatriz = t1.getSoma() + t2.getSoma() + t3.getSoma() + t4.getSoma();
        System.out.println("O somatorio da matriz e " + somatorioDaMatriz);


//        for(int contador = 0; contador < meuArray.length; contador++)
//        {
//            for(int contador2 = 0;contador2 < meuArray.length; contador2++)
//            {
//                System.out.print(meuArray[contador][contador2] + "\t");
//            }
//            System.out.println();
//        }


    }
}
