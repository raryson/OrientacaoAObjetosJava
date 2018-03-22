/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;
/**
 *
 * @author Raryson
 */
public class Casa {
    
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    static int quantidadeDePortas;

    public void pinta(String cor) {
        this.cor = cor;
    }
    
    public int quantasPortasEstaoAbertas()
    {
        int quantidadeDePortasabertas = 0;
        
        if(this.porta1 != null)
        {
            if(this.porta1.estaAberta() == true)
            {
                quantidadeDePortasabertas++;
            }
        }
        
        
        if(this.porta2 != null)
        {
            if(this.porta2.estaAberta() == true)
            {
                quantidadeDePortasabertas++;
            }
        }
        
        
        if(this.porta3 != null)
        {
           if(this.porta3.estaAberta() == true)
           {
               quantidadeDePortasabertas++;
           }
        }
       
        
        return quantidadeDePortasabertas;
    }
    
    public int totalDePortasInstaladas()
    {
        int contador = 0;
        if(porta1 != null)
        {
            contador++;
        }
        if(porta2 != null)
        {
            contador++;
        }
        if(porta3 != null)
        {
            contador++;
        }
        
        return contador;
    }

    public String getCor() {
        return cor;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    

    public Porta getPorta1() {
        return porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }
}
