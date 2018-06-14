package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);

        int quantidadeDeNumeros = 0, contador = 0, numeroInformado = 0, posicaoDoNumeroInformado = 0;
        ArrayList<Integer> intList = new ArrayList<Integer>();

        System.out.println("Digite a quantidade de numeros que voce deseja colocar na lista");
        quantidadeDeNumeros = userInput.nextInt();

        for(contador = 0; contador < quantidadeDeNumeros; contador++)
        {
            System.out.println("Digite o numero " + (contador+1) + " para ser adicionado na lista");
            numeroInformado = userInput.nextInt();

            if(numeroInformado < 0)
            {
                break;
            }

            intList.add(numeroInformado);

        }

        System.out.println("Digite o numero para ser excluido:");
        numeroInformado = userInput.nextInt();

        posicaoDoNumeroInformado = intList.indexOf(numeroInformado);

        if(posicaoDoNumeroInformado != -1)
        {
            intList.remove(posicaoDoNumeroInformado);
        }

        Collections.sort(intList);

        for(int val : intList)
        {
            System.out.print(val + "\t");
        }
    }
}
