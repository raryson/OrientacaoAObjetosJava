/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *
 * @author Raryson
 */
public class FabricaDeLampadas {
    
    public Lampada criarLamapada(char tipo)
    {
        if(tipo == 'L')
        {
            LED led = new LED();
            return led;
        }
        
        if(tipo == 'F')
        {
            Fluorecente f1 = new Fluorecente();
            return f1;
        }
         
        return null;
    }
    
}
