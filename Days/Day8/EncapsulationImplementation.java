package Days.Day8;

class Encapsulation {
    int a;

    Encapsulation(int a) {
        this.a = a;
    }

    void Display(int a) {
        System.out.print(a);
    }
}

public class EncapsulationImplementation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation(69);
    }
}
