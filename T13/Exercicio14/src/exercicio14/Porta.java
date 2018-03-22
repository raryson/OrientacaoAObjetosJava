/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

/**
 *
 * @author Raryson
 */
public class Porta {
    
    private boolean aberta;
    private String cor;

    public boolean estaAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }
    
     public void fecha() {
        this.aberta = false;
    }

    public void abre() {
        this.aberta = true;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }
    
    
}
