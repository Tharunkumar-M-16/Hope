package com.petadoption.service;

import com.petadoption.exception.PetNotAvailableException;
import com.petadoption.model.Adopter;
import com.petadoption.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class AdoptionService {
    private List<Pet> availablePets;

    public AdoptionService() {
        this.availablePets = new ArrayList<>();
    }

    public void registerPet(Pet pet) {
        if (pet != null) {
            availablePets.add(pet);
            System.out.println("Registered new pet: " + pet.getName());
        }
    }

    public void displayAvailablePets() {
        System.out.println("\n--- Available Pets ---");
        if (availablePets.isEmpty()) {
            System.out.println("No pets available at the moment.");
            return;
        }
        for (Pet pet : availablePets) {
            if (!pet.isAdopted()) {
                System.out.println(pet);
            }
        }
        System.out.println("----------------------\n");
    }

    public void adoptPet(Adopter adopter, String petId) throws PetNotAvailableException {
        // Validation and error handling
        if (adopter == null || petId == null || petId.trim().isEmpty()) {
            throw new IllegalArgumentException("Adopter details and Pet ID are required.");
        }

        for (Pet pet : availablePets) {
            if (pet.getId().equals(petId)) {
                if (pet.isAdopted()) {
                     throw new PetNotAvailableException("Sorry, pet " + pet.getName() + " is already adopted.");
                }
                
                // Process adoption
                pet.setAdopted(true);
                adopter.addAdoptedPet(pet);
                System.out.println("SUCCESS: " + adopter.getName() + " successfully adopted " + pet.getName() + "!");
                return;
            }
        }
        
        throw new PetNotAvailableException("Pet with ID " + petId + " not found in our records.");
    }
}
