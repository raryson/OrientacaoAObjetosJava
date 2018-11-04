package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLeitura {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo que contem os alunos");
        String nomeDoAquivo = userInput.nextLine();


        ArrayList<Aluno> alunos = new ArrayList();


        File arq = new File(nomeDoAquivo);

        if(arq.exists())
        {
            ObjectInputStream inputStream = null;
            try {
                inputStream = new ObjectInputStream(new FileInputStream(arq));
                alunos = (ArrayList<Aluno>)inputStream.readObject();
                for(Aluno aluno : alunos)
                {
                    System.out.println("O aluno " + aluno.getNome());
                    System.out.println("G1 " + aluno.getG1());
                    System.out.println("G2 " + aluno.getG2());
                    System.out.println("Media " + (aluno.getG1() + (aluno.getG2() * 2)) / 3);
                    if(((aluno.getG1() + (aluno.getG2() * 2)) / 3) > 6)
                    {
                        System.out.println("APROVADO");
                    }else{
                        System.out.println("REPROVADO");
                    }

                    System.out.println("--------------------------------------------------");
                }

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }



    }

}
