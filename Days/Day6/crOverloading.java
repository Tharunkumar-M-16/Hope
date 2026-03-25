package Days.Day6;

public class crOverloading {
    void crOverloading() {
        System.out.println("Default Constructor");
    }

    void crOverloading(int a) {
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        crOverloading c1 = new crOverloading();
        crOverloading c2 = new crOverloading(10);
    }
}
