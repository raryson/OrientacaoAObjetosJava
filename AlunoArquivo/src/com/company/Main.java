package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList();

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite o nome do aluno " + (contador + 1));
            String nome = userInput.nextLine();

            System.out.println("Digite a g1 do aluno " + (contador + 1));
            double g1 = userInput.nextDouble();

            System.out.println("Digite a g2 do aluno " + (contador + 1));
            double g2 = userInput.nextDouble();
            userInput.nextLine();

            Aluno aluno = new Aluno(nome, g1, g2);
            alunos.add(aluno);
        }

        File arq = new File("alunos.dat");
        ObjectOutputStream streamSaida = null;
        try {
            streamSaida = new ObjectOutputStream(new FileOutputStream(arq));
            streamSaida.writeObject(alunos);
            streamSaida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
