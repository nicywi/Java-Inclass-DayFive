package org.example.oop;

public class Phone {

    public static int numberOfPhones = 0;
    private String brand;
    private String model;

    public int year;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfPhones++;
    }
    public Phone(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        numberOfPhones++;
    }

    public void increment(){
        int counter = 0;
        counter++;
    }

    public static void decrementNumberOfPhones(){
        numberOfPhones--;
    }
}
