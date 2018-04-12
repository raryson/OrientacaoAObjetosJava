/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Raryson
 */
public class Loja {

    /**
     * @param args the command line arguments
     * Evite ao máximo repetição de código, utilizando a palavra super no construtor 
     * e nos métodos sobrescritos.
Em seguida, crie uma classe de testes que crie 5 produtos 
* diferentes (a sua escolha) e, a cada criação, imprima o conteúdo do produto criado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CD cd  = new CD("Summer eletrohits", 15, 5);
        DVD dvd = new DVD("Harry Potter", 90, 120);
        Livros livro = new Livros("Senhor dos aneis", "Tolkien", 80);
        DVD dvd2 = new DVD("Vingadores", 180, 200);
        CD cd2 = new CD("Evangelion", 150, 10);
        
        System.out.println(cd.toString());
        System.out.println(dvd.toString());
        System.out.println(livro.toString());
        System.out.println(dvd2.toString());
        System.out.println(cd2.toString());
    }
    
}
