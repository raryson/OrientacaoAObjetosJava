/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Raryson
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int perfectSquares = 0, counter = 1, numberImpars = 0, internalCounter, SumOfImpars = 0;

        while (counter < 10) {
            for (internalCounter = 0; internalCounter <= counter; internalCounter++) {
                if (internalCounter % 2 != 0) {
                    numberImpars++;
                }
            }

            System.out.println("Numero " + counter + " numeros impares ate ele " + numberImpars);
            
            for(internalCounter = 0; internalCounter < numberImpars; internalCounter++){
                
                SumOfImpars += internalCounter + 1;
            }
            
            System.out.println("A soma dos impares e " + SumOfImpars);
                
            if ((counter / numberImpars) == numberImpars) {
                System.out.println("O numero " + counter + " e um quadrado perfeito");
                perfectSquares++;
            }

            numberImpars = 0;
            SumOfImpars = 1;
            counter++;
        }
    }
}
