package Days.Day10;

public class getterSetter {

    public static void main(String[] args) {
        Name name = new Name();
        name.setName("John");
        System.out.println(name.getName());
    }
}

class Name {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}