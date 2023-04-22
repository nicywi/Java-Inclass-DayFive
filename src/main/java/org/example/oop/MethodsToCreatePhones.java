package org.example.oop;

public class MethodsToCreatePhones {
    public static Phone[] getListOfPhones(int number) {
        Phone[] result = new Phone[number];
        for (int i = 0; i < number; i++) {
            result[i] = new Phone("", "");
        }
        return result;
    }

}
