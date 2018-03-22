/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

/**
 *
 * @author Raryson
 */
public class Tamagoshi {
    
    //Os Atributos desta classe são: nome (String), fome (double), saúde (double) e idade (int)
    //Crie os Métodos Acessores destes atributos
    
    private String nome;
    private double fome;
    private double saude;
    private int idade;
    
    public Tamagoshi(String _nome, double _fome, double _saude, int _idade)
    {
        this.setNome(_nome);
        this.setFome(_fome);
        this.setSaude(_saude);
        this.setIdade(_idade);
    }
    
    /*Este humor é uma combinação entre os atributos Fome e Saúde ou seja, 
    um campo calculado que deve retornar um double. Então não devemos criar um atributo para 
    armazenar esta informação, por que ela pode ser calculada a qualquer momento 
    (apenas o método getHumor)*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(double fome) {
        
        if(this.fome >= 100)
        {
            return;
        }
        
        if(this.fome < 0)
        {
            return;
        }
        
        if((fome - this.fome) <= 0)
        {
            this.fome = 1;
        }
        
        if((this.fome + fome) >= 100)
        {
            this.fome = 100;
        }
        
        this.fome = fome;
      
    }

    public void setSaude(double saude) {
        
        if(this.saude >= 100)
        {
            return;
        }
        
        if(this.saude < 0)
        {
            return;
        }
        
        if((saude - this.saude) <= 0)
        {
            this.saude = 1;
        }
        
        if((this.saude + saude) >= 100)
        {
            this.saude = 100;
        }
        
        this.saude = saude;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        
    
    public double getHumor()
    {
        return (this.fome * 2) / this.saude;
    }
    
    public String getNome() {
        return nome;
    }

    public double getFome() {
        return fome;
    }

    public double getSaude() {
        return saude;
    }

    public int getIdade() {
        return idade;
    }
    
    
}
