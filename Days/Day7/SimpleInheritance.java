package Days.Day7;

public class SimpleInheritance {
    public static void main(String[] args) {
        // Using the Parent and Child classes from Inheritance.java
        // This file demonstrates simple inheritance using existing classes
        Animal animal = new Animal();
        animal.display();

        Dog dog = new Dog();
        dog.display();
        dog.Barking();
    }
}