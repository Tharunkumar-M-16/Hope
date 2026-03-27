package Days.Day7;

public class SimpleInheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();
        Child c1 = new Child();
        c1.display();

    }
}

class Parent {
    void display() {
        System.out.print("Parent Class");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.print("Child Class");
    }
}
