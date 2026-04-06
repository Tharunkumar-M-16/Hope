package com.petadoption.model;

public class Cat extends Pet {
    private boolean isIndoorOnly;

    public Cat(String id, String name, int age, double adoptionFee, boolean isVaccinated, boolean isIndoorOnly) {
        super(id, name, age, adoptionFee, isVaccinated);
        this.isIndoorOnly = isIndoorOnly;
    }

    public boolean isIndoorOnly() { return isIndoorOnly; }

    // Polymorphism: Implementing abstract methods
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow~");
    }

    @Override
    public String getCareInstructions() {
        return "Cats need a litter box, scratching posts, and interactive play.";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Cat [Indoor Only: %b]", isIndoorOnly);
    }
}
