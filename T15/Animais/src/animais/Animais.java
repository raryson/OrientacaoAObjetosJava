/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Raryson
 */
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie uma classe de Testes, criando os seguintes animais: camelo, tubarão, urso-canadense.
        Animal a1 = new Animal("Camelo", 4, "Deserto", "Amarelo", "2m", 100);
        a1.listaDados();
        
        Peixe p1 = new Peixe("Tubarao");
        p1.listaDados();
        
        Mamifero m1 = new Mamifero("Urso Canadense");
        m1.listaDados();
    }
    
}
