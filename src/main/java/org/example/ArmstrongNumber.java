package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // 1^3 + 5^3 + 3^3 = 153
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Wpisz liczbę: ");
        int number = keyboard.nextInt();
        System.out.println(Arrays.toString(createTable(number)));
        System.out.println("Czy jest liczba Armstronga? " + isArmstrong(number));
    }

    public static int[] createTable(int number) {
        String textNumber = String.valueOf(number);
        int[] result = new int[textNumber.length()];
        for (int i = textNumber.length() - 1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        boolean result = false;
        int[] array = createTable(number);
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i], array.length);
        }

        if (sum == number) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
