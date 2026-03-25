package Days.Day6;

class Apartment1 {
    public void bathroom() {
        System.out.println("Apartment 1: Bathroom - Modern");
    }

    public void kitchen() {
        System.out.println("Apartment 1: Kitchn");
    }

    public void hall() {
        System.out.println("Apartment 1: Hall");
    }

    public void bedroom() {
        System.out.println("Apartment 1: Bedroom ");
    }
}

class Apartment2 {
    public void bathroom() {
        System.out.println("Apartment 2: Bathroom ");
    }

    public void kitchen() {
        System.out.println("Apartment 2: Kitchen  ");
    }

    public void hall() {
        System.out.println("Apartment 2: Hall  ");
    }

    public void bedroom() {
        System.out.println("Apartment 2: Bedroom  ");
    }
}

class Apartment3 {
    public void bathroom() {
        System.out.println("Apartment 3: Bathroom - ");
    }

    public void kitchen() {
        System.out.println("Apartment 3: Kitchen -  ");
    }

    public void hall() {
        System.out.println("Apartment 3: Hall   ");
    }

    public void bedroom() {
        System.out.println("Apartment 3: Bedroom  ");
    }
}

public class Apartments {
    public static void main(String[] args) {
        System.out.println("--- Apartment 1 Details ---");
        Apartment1 a1 = new Apartment1();
        a1.bathroom();
        a1.kitchen();
        a1.hall();
        a1.bedroom();

        System.out.println("\n--- Apartment 2 Details ---");
        Apartment2 a2 = new Apartment2();
        a2.bathroom();
        a2.kitchen();
        a2.hall();
        a2.bedroom();

        System.out.println("\n--- Apartment 3 Details ---");
        Apartment3 a3 = new Apartment3();
        a3.bathroom();
        a3.kitchen();
        a3.hall();
        a3.bedroom();
    }
}
