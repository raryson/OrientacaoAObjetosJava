/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

/**
 *Um Aluno possui os atributos nome, enderecoResidencial, endereçoComercial e um número de matrícula.
 * @author Raryson
 */
public class Aluno {
    
    private String nome;
    private Endereco enderecoResidencial;
    private Endereco enderecoComercial;
    private String numeroDeMatricula;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the enderecoResidencial
     */
    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    /**
     * @param enderecoResidencial the enderecoResidencial to set
     */
    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    /**
     * @return the enderecoComercial
     */
    public Endereco getEnderecoComercial() {
        return enderecoComercial;
    }

    /**
     * @param enderecoComercial the enderecoComercial to set
     */
    public void setEnderecoComercial(Endereco enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    /**
     * @return the numeroDeMatricula
     */
    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    /**
     * @param numeroDeMatricula the numeroDeMatricula to set
     */
    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
    
    
    public String mostraTudo()
    {
        return "Nome " + getNome() + " Matricula " + getNumeroDeMatricula() + " \nEndereco Residencial: "
                + "Rua: " + getEnderecoResidencial().getRua() + " Bairro: " +getEnderecoResidencial().getBairro()
                + " CEP: " + getEnderecoResidencial().getCep() + " Cidade: " + getEnderecoResidencial().getCidade()
                + " Complemento " + getEnderecoResidencial().getComplemento() + " \nEndereco Comercial "
                + "Rua: " + getEnderecoComercial().getRua() + " Bairro: " +getEnderecoComercial().getBairro()
                + " CEP: " + getEnderecoComercial().getCep() + " Cidade: " + getEnderecoComercial().getCidade()
                + " Complemento " + getEnderecoComercial().getComplemento();
    }
}
