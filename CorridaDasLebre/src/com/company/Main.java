package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Lebre> lebres = new ArrayList<>();

        Lebre l1 = new Lebre();
        Lebre l2 = new Lebre();
        Lebre l3 = new Lebre();
        Lebre l4 = new Lebre();
        Lebre l5 = new Lebre();

        l1.setName("Lebre 1");
        l2.setName("Lebre 2");
        l3.setName("Lebre 3");
        l4.setName("Lebre 4");
        l5.setName("Lebre 5");

        lebres.add(l1);
        lebres.add(l2);
        lebres.add(l3);
        lebres.add(l4);
        lebres.add(l5);


        VerificaJogo verificador = new VerificaJogo(lebres);

        while(true)
        {
            l1.start();
            l2.start();
            l3.start();
            l4.start();
            l5.start();
            if(verificador.VerificaGanhador())
            {
                break;
            }
        }
    }

}

