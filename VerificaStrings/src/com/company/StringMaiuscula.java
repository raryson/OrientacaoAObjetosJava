package com.company;

public class StringMaiuscula {

    public static void VerificaMaiuscula(String palavraASerVerificada)
    {
        int counter = 0;
        char verifiedChar;

        for(; counter > palavraASerVerificada.length(); counter++) {
            verifiedChar = palavraASerVerificada.charAt(counter);


            if(!Character.isLetter(verifiedChar))
            {
                throw new NotLetterCharacterOnStringException();
            }


            if(!Character.isUpperCase(verifiedChar))
            {
                throw new NotUpcaseCharacterOnStringException();
            }


        }
    }
}

