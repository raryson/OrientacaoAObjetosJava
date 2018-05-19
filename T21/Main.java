import java.util.Scanner;


//No programa principal, pergunte ao usuário quantas formas ele deseja criar.
// Em seguida, para cada forma, pergunte se deseja criar um quadrado,
// um retângulo ou um círculo, solicitando os dados necessários para
//criar a forma.


public class Main
{
    public static void main(String[] args) {

        Scanner userInputedInfos = new Scanner(System.in);

        int quantasFormasOCaraQuer = 0, formaDigitada;

        System.out.println("Eae men, kkk, quantas formas voce deseja implementar?");
        quantasFormasOCaraQuer = userInputedInfos.nextInt();

        FiguraGeometrica figura[] = new FiguraGeometrica[quantasFormasOCaraQuer];

        for(int contador = 0; contador < quantasFormasOCaraQuer; contador++)
        {
            System.out.println("Para digitar um quadrado digite 1");
            System.out.println("Para digitar um retangulo digite 2");
            System.out.println("Para digitar um circulo digite 3");

            formaDigitada = userInputedInfos.nextInt();

            if(formaDigitada == 1)
            {
                System.out.println("Digite um lado para o quadrado");
                double ladoDoQuadrado = userInputedInfos.nextDouble();

                Quadrado q1 = new Quadrado(ladoDoQuadrado);
                figura[contador] = q1;

            }
            else if(formaDigitada == 2)
            {
                System.out.println("Digite a altura para o retangulo");
                double alturaDoRetangulo = userInputedInfos.nextDouble();

                System.out.println("Digite um lado para o retangulo");
                double ladoDoRetangulo = userInputedInfos.nextDouble();

                Retangulo r1 = new Retangulo(ladoDoRetangulo, alturaDoRetangulo);
                figura[contador] = r1;

            }
            else
            {
                System.out.println("Digite a base do circulo");
                double baseDoCirculo = userInputedInfos.nextDouble();

                Circulo c1 = new Circulo(baseDoCirculo);

                figura[contador] = c1;
            }
        }

        for(int contador = 0; contador < quantasFormasOCaraQuer; contador++)
        {
            
            System.out.println(figura[contador].retornaValores());
            System.out.println(figura[contador].calculaArea());
            System.out.println(figura[contador].calculaPerimetro());
            System.out.println("---------------------------------------");
        }

        
    }

}
