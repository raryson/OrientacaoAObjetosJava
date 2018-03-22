/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio16;



public class Carro {
    
    private String cor;
    private double capacidadeDoMotor;
    private int velocidade;

    public Carro(String _cor, double _capacidadeDoMotor)
    {
        this.cor = _cor;
        this.capacidadeDoMotor = _capacidadeDoMotor;
   
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    public double getCapacidadeDoMotor()
    {
        return this.capacidadeDoMotor;
    }
    
    public int getVelocidade()
    {
        return this.velocidade;
    }
    
    public void AumentarAVelocidade(double aumento)
    {
        double velocidadeMaxima = (this.capacidadeDoMotor * 110);
        
        if(aumento <= 0 )
        {
            System.out.println("O valor precisa ser maior que zero");
            System.exit(1);
        }
        
        if((this.velocidade + aumento) < velocidadeMaxima)
        {
            this.velocidade += aumento;
        }else
        {
            this.velocidade = (int)velocidadeMaxima;
            System.out.println("O motor nao suporta tal velocidade");
        }
    }
    
    public void DiminuirAVelocidade(double diminuir)
    {
        double velocidadeMaxima = (this.capacidadeDoMotor * 110);
        
        if(diminuir <= 0 )
        {
            System.out.println("O valor precisa ser maior que zero");
            System.exit(1);
        }
        
        if(diminuir >= 60)
        {
            System.out.println("Airbag disparado");
        }
        
        if((this.velocidade - diminuir) > 0)
        {
            this.velocidade -= diminuir;
        }else
        {
            this.velocidade = 0;
        }
    
    }
    
    

    
}
