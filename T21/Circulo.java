//Uma classe chamada Circulo, que implementa a interface FiguraGeometrica. 
//Seu construtor deve receber o tamanho do raio.
//public abstract double calculaPerimetro();
//public abstract double calculaArea();

public class Circulo implements FiguraGeometrica
{
    private double tamanhoDoRaio;

    public Circulo(double tamanhoDoRaio)
    {
        this.tamanhoDoRaio = tamanhoDoRaio;
    };

    public double calculaPerimetro()
    {
        return 2 * 3.14 * this.tamanhoDoRaio;
    }

    public double calculaArea()
    {
        return 3.14 * (this.tamanhoDoRaio * this.tamanhoDoRaio);
    }

    public double getRaio()
    {
        return this.tamanhoDoRaio;
    }

    public String retornaValores()
    {
        return "O raio do circulo e " + this.getRaio();
    }

}