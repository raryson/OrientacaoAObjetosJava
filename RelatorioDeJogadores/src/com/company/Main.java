package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {


    //Jogadores
    //- 0001 - Marcelo Grohe (Goleiro)
    //... Salário = 27500,00 (Salário Base: 10000,00; Bonificação: 5000.0; Gratificação: 2500,00)
    //... IMC = 27,78 (Peso: 90,00; Altura: 1,80)


    //- 0002 - Luan (Atacante)
    //... Salário = 42000,00 (Salário Base: 15000,00; Bonificação: 7000.0; Gratificação: 5000,00)
    //... IMC = 29,41 (Peso: 85,00; Altura: 1,70)


    //Técnico (123456789 - Renato Portaluppi)
    //... Salário = 30250,00 (Salário Base: 15000,00; Títulos: 1)

    //- 2017 : Copa Libertadores da América
    //- 2018 : Recopa
    //- 2018 : Campeonato Gaúcho

    public static void main(String[] args) {
	// write your code here

        Jogador grohe = new Jogador("Goleiro", 5000, 2500, 90, 1.80,
                "Marcelo Grohe", "0001", 10000);

        Jogador luan = new Jogador("Atacante", 7000, 5000, 85, 1.70,
                "Luan", "0002", 15000);

        Tecnico tecnico  = new Tecnico("Renato Portaluppi", "123456789", 15000, 1);

        Titulo t1 = new Titulo(2018, "Campeonato Gaucho");
        Titulo t2 = new Titulo(2018, "Recopa");
        Titulo t3 = new Titulo(2017, "Copa Libertadores da America");

        ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

        listaJogadores.add(grohe);
        listaJogadores.add(luan);

        TreeSet<Titulo> titulosList = new TreeSet<Titulo>();

        titulosList.add(t1);
        titulosList.add(t2);
        titulosList.add(t3);

        Time time = new Time("Grêmio Foot-Baal Portoalegrense", listaJogadores, titulosList, tecnico);
        time.exibeRelatorioCadastral();

    }
}
