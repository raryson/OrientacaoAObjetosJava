/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Raryson
 * Um peixe é um animal, tem 0 patas, o seu ambiente é o mar (padrão), cor cinzenta (padrão)
 *  private String nome;
    private int numeroDePatas;
    private String ambiente;
    private String comprimento;
    private String cor;
    private double velocidade;
 * 
 */
public class Peixe extends Animal {
    
    private String cor = "cinzenta";

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Peixe(String nome)
    {
        super(nome, "mar"); 
        this.setNumeroDePatas(0);
    }
    
    public Peixe(String nome, String ambiente)
    {
        super(nome, ambiente);
        this.setNumeroDePatas(0);
    }
    
    public Peixe(String nome, String ambiente, String cor)
    {
        super(nome, ambiente);
        this.cor = cor;
        this.setNumeroDePatas(0);
    }
    
    
    //Um peixe é um animal, tem 0 patas, o seu ambiente é o mar (padrão), cor cinzenta (padrão)
    @Override
    public void listaDados()
    {
        System.out.println("O nome do animal e: " + this.getNome());
        System.out.println("O animal tem " + this.getNumeroDePatas() + " patas");
        System.out.println("O seu ambiente e: " + this.getAmbiente());
        System.out.println("A cor desse animal e " + this.getCor());
    }

    
}
