package com.petadoption.model;

public class Dog extends Pet {
    private String breed;
    private String size; 

    public Dog(String id, String name, int age, double adoptionFee, boolean isVaccinated, String breed, String size) {
        super(id, name, age, adoptionFee, isVaccinated);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() { return breed; }
    public String getSize() { return size; }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    @Override
    public String getCareInstructions() {
        return "Dogs need daily walks, balanced diet, and regular training.";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Dog [Breed: %s, Size: %s]", breed, size);
    }
}
