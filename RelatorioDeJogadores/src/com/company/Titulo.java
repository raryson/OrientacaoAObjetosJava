package com.company;

public class Titulo implements Comparable<Titulo> {

    private int anoDoTitulo;
    private String desccricao;

    public Titulo(int ano, String descricao)
    {
        this.anoDoTitulo = ano;
        this.desccricao = descricao;
    }

    public int getAnoDoTitulo() {
        return anoDoTitulo;
    }

    public void setAnoDoTitulo(int anoDoTitulo) {
        this.anoDoTitulo = anoDoTitulo;
    }

    public String getDesccricao() {
        return desccricao;
    }

    public void setDesccricao(String desccricao) {
        this.desccricao = desccricao;
    }
// @Override
//    public int compare(Empl e1, Empl e2) {
//        if(e1.getSalary() > e2.getSalary()){
//            return 1;
//        } else {
//            return -1;
//        }
//    }
    @Override
    public int compareTo(Titulo object) {

        if(this.anoDoTitulo > object.anoDoTitulo)
        {
            return 1;
        }
        else if(this.anoDoTitulo == object.anoDoTitulo)
        {
            return 1;
        }
        else
            {
                return -1;
            }
    }
}
