package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner oQueOUsuarioDigitou = new Scanner(System.in);

        System.out.println("JOGO DO BAGULHO ALEATORIO");
        System.out.println("Digite 1 para um jogador e 2 para dois jogadores");
        int numeroDeJogadores = oQueOUsuarioDigitou.nextInt();
        int contadorDeVezes = 0;
        Random random = new Random();

        if(numeroDeJogadores == 1)
        {
            int numeroAleatorio = random.nextInt(1000) + 1;
            while(true)
            {
                System.out.println("Digite o numero que tu acha que e");
                int numeroDigitado = oQueOUsuarioDigitou.nextInt();
                if(numeroDigitado == numeroAleatorio)
                {
                    System.out.println("Acerto mizeravi");
                    contadorDeVezes++;
                    System.out.println("Tu tentou "+ contadorDeVezes + " vezes");
                    break;
                }
                else if(numeroDigitado > numeroAleatorio)
                {
                    contadorDeVezes++;
                    System.out.println("O numero que tu digitou e maior que o aleatorio");
                }
                else
                {
                    contadorDeVezes++;
                    System.out.println("O numero que tu digitou e menor que o aleatorio");
                }

            }
        }
        else if(numeroDeJogadores == 2)
        {
            System.out.println("Digite um numero para o segundo jogador adivinhar, tem que ser de 1 a 1000");
            int numeroDoJogadorUm = oQueOUsuarioDigitou.nextInt();
            while(true)
            {
                System.out.println("Digite o numero que tu acha que e");
                int numeroDigitado = oQueOUsuarioDigitou.nextInt();
                if(numeroDigitado == numeroDoJogadorUm)
                {
                    System.out.println("Acerto mizeravi");
                    contadorDeVezes++;
                    System.out.println("Tu tentou "+ contadorDeVezes + " vezes");
                    break;
                }
                else if(numeroDigitado > numeroDoJogadorUm)
                {
                    contadorDeVezes++;
                    System.out.println("O numero que tu digitou e maior que o aleatorio");
                }
                else
                {
                    contadorDeVezes++;
                    System.out.println("O numero que tu digitou e menor que o aleatorio");
                }
            }
        }
        else
        {
            System.out.println("Tu digito algo invalido");
        }
    }
}
