package org.example.regex;

public class JavaPasswordValidate {

    public static boolean isValid (String password){
        int counterUpperLetterCase = 0;
        int counterLowerLetterCase = 0;
        int counterSymbol = 0;
        int counterDigit = 0;

        if(password.length() >= 8 && password.length() <=20){
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if(Character.isDigit(character)){
                    counterDigit++;
                } else if (Character.isUpperCase(character)) {
                    counterUpperLetterCase++;
                } else if (Character.isLowerCase(character)) {
                    counterLowerLetterCase++;
                } else if (character >= 33 && character <= 47 || character >= 58 && character <= 64 || character >= 91 && character <= 96 || character >= 123 && character <= 126) {
                    counterSymbol++;
                }
            }
            return counterUpperLetterCase > 0 && counterLowerLetterCase > 0 && counterSymbol > 0 && counterDigit >0;
        }else {
            return false;
        }
    };
}
