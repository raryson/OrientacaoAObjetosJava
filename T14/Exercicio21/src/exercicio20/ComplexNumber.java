/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20;

/**
 *
 * @author Raryson
 */
public class ComplexNumber {
    private double x;
    private double y;
    private double i;
    
    public ComplexNumber()
    {
        this.x = 0;
        this.y = 0;
        this.i = 0;
    }
    
    public ComplexNumber(double x, double y, double i)
    {
        this.x = x;
        this.y = y;
        this.i = i;
    }
    
    public ComplexNumber SomaNumeroComplexo(ComplexNumber a, ComplexNumber b)
    {
        //(a + c) + (b + d)i. 
        return new ComplexNumber((a.x + (b.y * a.i)) , (a.y + (b.x * b.i)), a.i * b.i);
        
    }
}
