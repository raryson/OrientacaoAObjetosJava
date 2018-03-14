/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author Raryson
 */
public class Data {
    
    private int dia;
    private int ano;
    private int mes;
    
    public void setDia(int dia)
    {
        this.dia = dia;
    }
    
    public int getDia()
    {
        return this.dia;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    
    public int getMes()
    {
        return this.mes;
    }
    
    public String mostraData()
    {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }
    
}
