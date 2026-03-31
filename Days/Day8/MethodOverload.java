public class MethodOverload {
    void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of " + a + ", " + b + ", and " + c + " is " + (a + b + c));
    }

    void add(int a, int b, int c, int d) {
        System.out.println("Sum of " + a + ", " + b + ", " + c + ", and " + d + " is " + (a + b + c + d));
    }

     

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10,2,30,40);
    }
}
