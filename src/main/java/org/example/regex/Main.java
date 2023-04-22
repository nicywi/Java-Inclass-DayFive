package org.example.regex;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[] {
                "Alama$kota1",
                "Ala_makota3",
                "Ala_makota17",
                "Ala%ma$kota122",
                "Ala77makota1%22",
                "Alama99kota1&1",
                "Alamakota1",
                "Ala1",
                "Alama$&&&ooooooooooookota1",
                "Alamakota1",
        };

        long regexStart = System.currentTimeMillis();
        for (String element : array){
            System.out.printf("\nHasło: %s, isValid: %b", element, RegexPasswordValidate.isValid(element));
        }
        long regexStop = System.currentTimeMillis();
        System.out.println("\nCzas wykonywania regex: " + (regexStop - regexStart));

        long javaStart = System.currentTimeMillis();
        for (String element : array){
            System.out.printf("\nHasło: %s, isValid: %b", element, RegexPasswordValidate.isValid(element));
        }
        long javaStop = System.currentTimeMillis();
        System.out.println("\nCzas wykonywania java: " + (javaStop - javaStart));
    }
}
