package Days.Day7;

public class MultiIn {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display1();
        c1.display2();
        c1.display3();
    }
}

class Grandparent {
    void display1() {
        System.out.println("Grandparent Class");
    }
}

class Parent extends Grandparent {
    void display2() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void display3() {
        System.out.println("Child Class");
    }
}
