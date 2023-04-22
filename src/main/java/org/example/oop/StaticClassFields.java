package org.example.oop;

public class StaticClassFields {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("Samsung", "Galaxy");
        Phone phoneTwo = new Phone("iPhone", "7");
        Phone phoneThree = new Phone("Xiaomi", "Mi9");
        Phone phoneFour = new Phone("Xiaomi", "Mi9");
        Phone phoneFive = new Phone("Xiaomi", "Mi9", 2019);

        Phone[] listOfPhones = MethodsToCreatePhones.getListOfPhones(50);

        System.out.println("Liczba telefonów: " + Phone.numberOfPhones);

        System.out.println("Rok: " + phoneFive.year);

        Phone.decrementNumberOfPhones();
        System.out.println("Liczba telefonów: " + Phone.numberOfPhones);

    }
}
