/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Raryson
 * Um animal possui nome, comprimento, número de patas (padrão é 4), 
 * uma cor, ambiente e uma velocidade (em m/s)
 */
public class Animal {
    
    private String nome;
    private int numeroDePatas = 4;
    private String ambiente;
    private String comprimento;
    private String cor;
    private double velocidade;
    
    public Animal(String nome, int numeroDePatas, String ambiente, String comprimento, String cor, double velocidade)
    {
        this.nome = nome;
        this.ambiente  = ambiente;
        this.numeroDePatas = numeroDePatas;
        this.comprimento = comprimento;
        this.cor = cor;
        this.velocidade = velocidade;
      
    }
    
    public Animal(String nome, String ambiente)
    {
        this.nome = nome;
        this.ambiente  = ambiente;     
      
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    

    public String getNome() {
        return nome;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    public void listaDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Numero de patas: " + this.numeroDePatas);
        
    }
    
    
}
