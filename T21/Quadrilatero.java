//Uma classe abstrata chamada Quadrilatero.
// Seu construtor deve receber os tamanhos dos 4 lados e o um método
// chamado calculaPerimetro que retorna o perímetro do quadrilátero

public abstract class Quadrilatero
{
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Quadrilatero(double lado1, double lado2, double lado3, double lado4)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double calculaPerimetro()
    {
        return this.lado1 + this.lado2 + this.lado3 + this.lado4;
    }
    
    public double getLado1()
    {
        return this.lado1;
    }

    public double getLado2()
    {
        return this.lado2;
    }

    public double getLado3()
    {
        return this.lado3;
    }

    public double getLado4()
    {
        return this.lado4;
    }

    public void setlado1(double lado1)
    {
        this.lado1 = lado1;
    }

    public void setlado2(double lado2)
    {
        this.lado2 = lado2;
    }


    public void setlado3(double lado3)
    {
        this.lado3 = lado3;
    }


    public void setlado4(double lado4)
    {
        this.lado4 = lado4;
    }



}