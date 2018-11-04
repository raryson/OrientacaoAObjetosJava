package com.company;
//
//Crie duas threads onde:
//
//        A primeira fica enviando notícias a cada 5 segundos (textos quaisquer, vindos a partir de um ArrayList
// de String contendo 10 notícias)
//        A segunda fica enviando a data/hora atual a cada 10 segundos.
//        Assim que a hora for informada pela quinta vez, o programa deve encerrar.
//
//        Não pode ser utilizado atributos estáticos.

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadNoticias t1 = new ThreadNoticias();
        ThreadHora t2 = new ThreadHora();
        t1.start();
        t2.start();
        while(true)
        {
            if(!t2.isAlive())
                System.exit(0);
        }
    }
}
