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
public class Ponto {
    
    private double x;
    private double y;
    
    public Ponto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void imprimeValores()
    {
        System.out.println("O valor de x e: " + this.x);
        System.out.println("O valor de y e: " + this.y);
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
         
    
}
