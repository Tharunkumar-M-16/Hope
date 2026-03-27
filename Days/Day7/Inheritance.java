package Days.Day7;

public class Inheritance {
    public static void main(String[] args) {
         Dog d1=new Dog();
        d1.display();
        d1.Barking();
    }
}
class Animal{
    void display(){
        System.out.println("Animal Class");
    }
}
class Dog extends Animal{
    void Barking(){
        System.out.println("Barking");
    }
}