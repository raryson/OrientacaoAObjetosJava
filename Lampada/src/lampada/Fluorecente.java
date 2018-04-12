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
public class Fluorecente extends Lampada{
    
    @Override
    public String mostraEstado()
    {
        return "Fluorecente " + super.mostraEstado();
    }
    
}
