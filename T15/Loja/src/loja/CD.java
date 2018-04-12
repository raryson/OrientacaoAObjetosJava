/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Raryson
 */
public class CD extends Item {
    
    private int numeroDeFaixas;
    
    public CD(String nome, double valor, int numeroDeFaixas)
    {
        super(nome, valor);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }
    
    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nNumero de faixas: " + getNumeroDeFaixas();
    }
    
}
