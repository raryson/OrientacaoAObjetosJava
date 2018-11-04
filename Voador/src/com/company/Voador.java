package com.company;

public class Voador {
    private int metrosVoados;
    private boolean voando;

    public void decolar()
    {
        this.voando = true;
    }

    public void pousar()
    {
        this.voando = false;
    }

    public void voar(int metrosVoados)
    {
        this.metrosVoados =+ metrosVoados;
    }

    public int getMetrosVoados() {
        return metrosVoados;
    }

    public void setMetrosVoados(int metrosVoados) {
        this.metrosVoados = metrosVoados;
    }
}
