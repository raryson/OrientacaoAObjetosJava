/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

/**
 *
 * @author Raryson
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Endereco endereco1 = new Endereco();
        endereco1.setBairro("Cohab A");
        endereco1.setCep("12345678");
        endereco1.setCidade("Gravatai");
        endereco1.setNumero("12");
        endereco1.setRua("Rua gremio");
        endereco1.setComplemento("ab");
        
        
        Endereco endereco2 = new Endereco();
        endereco2.setBairro("Cohab B");
        endereco2.setCep("87654321");
        endereco2.setCidade("Porto Alegre");
        endereco2.setNumero("24");
        endereco2.setRua("Rua Inter");
        endereco2.setComplemento("a");
        
        
        Endereco endereco3 = new Endereco();
        endereco3.setBairro("Cohab C");
        endereco3.setCep("54321876");
        endereco3.setCidade("Novo Hamburgo");
        endereco3.setNumero("36");
        endereco3.setRua("Fluminense");
        endereco3.setComplemento("bvc");
        
        Aluno aluno = new Aluno();
        aluno.setEnderecoResidencial(endereco1);
        aluno.setEnderecoComercial(endereco2);
        aluno.setNome("Glauber");
        aluno.setNumeroDeMatricula("12345");
        
        Aluno aluno2 = new Aluno();
        aluno2.setEnderecoResidencial(endereco2);
        aluno2.setEnderecoComercial(endereco3);
        aluno2.setNome("Marcela");
        aluno2.setNumeroDeMatricula("54321");
    
        Aluno aluno3 = new Aluno();
        aluno3.setEnderecoResidencial(endereco3);
        aluno3.setEnderecoComercial(endereco1);
        aluno3.setNome("Bolt");
        aluno3.setNumeroDeMatricula("12543");
       
        
        System.out.println(aluno.mostraTudo());
        System.out.println(aluno2.mostraTudo());
        System.out.println(aluno3.mostraTudo());
        
       
    }
    
}
