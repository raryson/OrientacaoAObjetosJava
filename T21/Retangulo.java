//Classes para representar Retângulos e Quadrados. A primeira deve receber o tamanho
//da base e da altura no construtor, enquanto a segunda deve receber apenas o tamanho
// do lado. Estas classes devem ser subclasses da classe Quadrilatero e implementar a 
//interface FiguraGeometrica

public class Retangulo extends Quadrilatero implements FiguraGeometrica
{
    public Retangulo(double lado, double altura)
    {
        super(lado, altura, lado, altura);
    }

    public double calculaPerimetro()
    {
        return this.getLado1() + this.getLado2() + this.getLado3() + this.getLado4()  ;
    }

    public double calculaArea()
    {
        return getLado1() * getLado2();
    }

    public String retornaValores()
    {
        return"A altura do retangulo e " + this.getLado2() + " e o diametro e " + this.getLado1();
    }

}