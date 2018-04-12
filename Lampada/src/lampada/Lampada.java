/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *Crie uma classe chamada Lâmpada, com o atributo estado (ligado/desligado)
 * e os métodos Ligar e Desligar e um método chamado mostraEstado() que mostra o estado da Lâmpada
 * @author Raryson
 */
public class Lampada {
    
    private boolean estado;
    
    public void Ligar()
    {
        this.estado = true;
    }
    
    public void Desligar()
    {
        this.estado = false;
    }
    
    public String mostraEstado()
    {
        if(this.estado)
            return "Ligado";
        
        return "Desligado";
    }
}
