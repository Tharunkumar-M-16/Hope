package com.petadoption.model;

import java.util.ArrayList;
import java.util.List;

public class Adopter {
    private String name;
    private String contactInfo;
    private List<Pet> adoptedPets;

    public Adopter(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.adoptedPets = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
    
    // Encapsulation of the pet list modification
    public void addAdoptedPet(Pet pet) {
        if (pet != null) {
            adoptedPets.add(pet);
        }
    }
    
    public List<Pet> getAdoptedPets() {
        return new ArrayList<>(adoptedPets); // Return a copy to protect internal state
    }

    @Override
    public String toString() {
        return String.format("Adopter: %s (Contact: %s) - Pets Adopted: %d", name, contactInfo, adoptedPets.size());
    }
}
