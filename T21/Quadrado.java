//Classes para representar Retângulos e Quadrados. A primeira deve receber o tamanho
//da base e da altura no construtor, enquanto a segunda deve receber apenas o tamanho
// do lado. Estas classes devem ser subclasses da classe Quadrilatero e implementar a 
//interface FiguraGeometrica
//public abstract double calculaPerimetro();
//public abstract double calculaArea();


public class Quadrado extends Quadrilatero implements FiguraGeometrica
{

    public Quadrado(double lado)
    {
        super(lado, lado, lado, lado);
    }

    public double calculaPerimetro()
    {
        return this.getLado1() * 4  ;
    }

    public double calculaArea()
    {
        return getLado1() * getLado1();
    }

    public String retornaValores()
    {
        return "Valor dos lados do quadrado: " + this.getLado1();
    }
}