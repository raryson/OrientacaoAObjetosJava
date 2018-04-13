/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacotche;

/**
 *
 * @author Raryson
 */
public class Matriz {
    private int[] linha;
    private int[] coluna;
    
    public Matriz(int lenght)
    {
        this.linha = new int[lenght];
        this.coluna = new int [lenght];
        
    }

    public void setLinha(int[] linha) {
        this.linha = linha;
    }

    public void setColuna(int[] coluna) {
        this.coluna = coluna;
    }
    
    

    public int[] getLinha() {
        return linha;
    }

    public int[] getColuna() {
        return coluna;
    }

    
    
    
}
