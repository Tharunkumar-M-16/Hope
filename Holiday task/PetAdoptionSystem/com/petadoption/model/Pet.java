package com.petadoption.model;

public abstract class Pet {
    private String id;
    private String name;
    private int age;
    private double adoptionFee;
    private boolean isAdopted;
    private boolean isVaccinated;

    public Pet(String id, String name, int age, double adoptionFee, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adoptionFee = adoptionFee;
        this.isVaccinated = isVaccinated;
        this.isAdopted = false; // By default, not adopted
    }

    public abstract void makeSound();

    public abstract String getCareInstructions();

    // Getters and Setters for Encapsulation
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAdoptionFee() {
        return adoptionFee;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%d years old) - Fee: $%.2f | Vaccinated: %b | Adopted: %b",
                id, name, age, adoptionFee, isVaccinated, isAdopted);
    }
}
