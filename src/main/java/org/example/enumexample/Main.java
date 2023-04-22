package org.example.enumexample;

public class Main {
    public static void main(String[] args) {
        Animal[] array = new Animal[]{
                new Animal("Jacek", AnimalKind.HORSE, 4),
                new Animal("Jan", AnimalKind.DOG, 2),
                new Animal("Eryk", AnimalKind.SHARK, 5),
                new Animal("Bartek", AnimalKind.CAT, 1),
        };

        for (Animal animal: array){
            System.out.printf("Imie: %s, wiek: %d, typ: %s , ", animal.getName(), animal.getAge(), animal.getAnimalKind());

            if(animal.getAnimalKind().isDangerous()){
                System.out.println("Uważaj te zwierze jest niebezpieczne");
            }else {
                System.out.println("To zwierze jest bezpieczne");
            }
        }
    }
}
