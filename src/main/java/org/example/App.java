package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Wpisz liczbę: " );
        int number = keyboard.nextInt();
        //System.out.println(Arrays.toString(createTableFromNumber(number)));
        System.out.println(Arrays.toString(createTable(number)));
    }

    //Metoda pozwala z ciagu liczb zrobic tablice
    public static int[] createTableFromNumber(int number){

        //valueOf
        String textNumber = String.valueOf(number);
        char[] chars = textNumber.toCharArray();
        //int [] result = new int[chars.length];
        int [] result = new int[textNumber.length()];

        for (int i = 0; i < chars.length; i++) {
            result[i] = Character.getNumericValue(chars[i]);
        }
        return result;
    }

    public static int[] createTable(int number){
        String textNumber = String.valueOf(number);
        int [] result = new int[textNumber.length()];
        for (int i = textNumber.length() - 1; i >= 0; i--) {
           result[i] =  number % 10;
           number /=10;
        }
        return result;
    }
}
