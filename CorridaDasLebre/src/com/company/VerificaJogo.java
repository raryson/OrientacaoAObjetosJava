package com.company;


import java.util.ArrayList;

public class VerificaJogo
{
    private ArrayList<Lebre> _jogadores;

    public VerificaJogo(ArrayList<Lebre> jogadores)
    {
        _jogadores = jogadores;
    };

    public boolean VerificaGanhador()
    {
        for(Lebre lebre : _jogadores)
        {
            if(lebre.getMetrosPercoridos() >= 20)
            {
                System.out.println("A lebre " + lebre.getName() + " ganhou");
                for(Lebre lebreDois : _jogadores)
                {
                    System.out.println("A lebre " + lebreDois.getName() + " percorreu " + lebreDois.getMetrosPercoridos());
                }
                return true;
            }
        }
        return false;
    }
}