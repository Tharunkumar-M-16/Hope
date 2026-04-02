package Days.Day9;

public class Abstraction {
    public static void main(String[] args)
    {
        Animal d=new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }
}
abstract class Animal{
    abstract void sound();
    void Eat(){
        System.out.print("Animal Eats") ;
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meow");

    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
    
}
