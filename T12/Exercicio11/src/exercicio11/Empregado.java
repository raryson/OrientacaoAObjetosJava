/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author Raryson
 */
public class Empregado {
    
    private String nome;
    private double salario;
    
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void aumentaSalario(double percentualParaAumentar)
    {
        if(percentualParaAumentar < 0 )
        {
            System.out.println("O percentual nao pode ser negativo");
            System.exit(1);
        }
        
        if(getSalario() < 0)
        {
            setSalario(0);
        }
        
        double salarioQueSeraAumentado = getSalario() * (percentualParaAumentar/100);
        setSalario(getSalario() + salarioQueSeraAumentado);
    }
    
}
