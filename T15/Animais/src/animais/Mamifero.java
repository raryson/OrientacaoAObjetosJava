/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Raryson
 * Um mamífero é um animal, o seu ambiente é a terra (padrão)
 * private String nome;
    private int numeroDePatas;
    private String ambiente;
    private String comprimento;
    private String cor;
    private double velocidade;
 */
public class Mamifero extends Animal{
   
   public Mamifero(String nome)
   {
       super(nome, "terra");
   }
   
   public Mamifero(String nome, String ambiente)
   {
       super(nome, ambiente);
   }
   
   @Override
   public void listaDados()
   {
       System.out.println("O nome do animal e: " + this.getNome());
       System.out.println("O ambiente do animal e: " + this.getAmbiente());
   }
}
