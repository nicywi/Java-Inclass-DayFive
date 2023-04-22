package org.example.enumexample;

public enum AnimalKind {
    HORSE(false),
    CAT(false),
    DOG(true),
    SHARK(true);

    private boolean isDangerous;

    AnimalKind(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public boolean isDangerous() {
        return isDangerous;
    }
}
