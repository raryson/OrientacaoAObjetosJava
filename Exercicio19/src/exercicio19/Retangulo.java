/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

/**
 *
 * @author Raryson
 */
public class Retangulo {
    
    private double altura;
    private double largura;
    private Ponto vertice;
    
    public Retangulo(double altura, double largura, Ponto vertice)
    {
        this.altura = altura;
        this.largura = largura;
        this.vertice = vertice;
    }
    

    public Ponto getVertice() {
        return vertice;
    }

    public void setVertice(double x, double y)
    {
        Ponto p = new Ponto(x, y);        
        this.vertice = p;
    }
    
    public Ponto getCentro()
    {
        Ponto p = new Ponto(this.largura/2, this.altura/2);
        return p;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
    
    
    
}
