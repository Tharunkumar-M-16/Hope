package com.petadoption.main;

import com.petadoption.exception.PetNotAvailableException;
import com.petadoption.model.Adopter;
import com.petadoption.model.Cat;
import com.petadoption.model.Dog;
import com.petadoption.model.Pet;
import com.petadoption.service.AdoptionService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Terminal Pet Adoption System\n");

        AdoptionService service = new AdoptionService();

        // 1. Creating pets (Polymorphism & Inheritance)
        Pet dog1 = new Dog("D001", "Buddy", 3, 150.0, true, "Golden Retriever", "Large");
        Pet cat1 = new Cat("C001", "Whiskers", 2, 80.0, true, true);
        Pet dog2 = new Dog("D002", "Max", 1, 120.0, false, "Beagle", "Medium");

        // 2. Register pets in the system
        service.registerPet(dog1);
        service.registerPet(cat1);
        service.registerPet(dog2);

        // 3. Display available pets
        service.displayAvailablePets();

        // 4. Create an adopter
        Adopter adopter1 = new Adopter("Alice Smith", "alice@example.com");
        
        // Let's hear from the pets (Polymorphism)
        System.out.println("Let's meet the pets:");
        dog1.makeSound();
        cat1.makeSound();
        System.out.println("Care for Dog1: " + dog1.getCareInstructions());
        System.out.println("");

        // 5. Normal Adoption Process
        try {
            System.out.println("Attempting to adopt D001...");
            service.adoptPet(adopter1, "D001");
        } catch (PetNotAvailableException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 6. Demonstrate Error Handling (Adopting an already adopted pet)
        try {
            System.out.println("\nAttempting to adopt D001 again...");
            Adopter adopter2 = new Adopter("Bob Johnson", "bob@example.com");
            service.adoptPet(adopter2, "D001");
        } catch (PetNotAvailableException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        // 7. Demonstrate Error Handling (Pet not found)
        try {
            System.out.println("\nAttempting to adopt an invalid pet C999...");
            service.adoptPet(adopter1, "C999");
        } catch (PetNotAvailableException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 8. Display Adopter Status
        System.out.println("\n--- Adopter Profile ---");
        System.out.println(adopter1);
        System.out.println("Pets:");
        for (Pet pet : adopter1.getAdoptedPets()) {
            System.out.println(" - " + pet.getName() + " (" + pet.getClass().getSimpleName() + ")");
        }
        
        // 9. Display Remaining available pets
        service.displayAvailablePets();
    }
}
