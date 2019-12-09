package Polymorphism;

public class InternationalTraveller {
    private String nationality;

    public InternationalTraveller(String nationality) {
        this.nationality = nationality;
    }

    public void printSummary() {
        System.out.println("Hey there!!! I am from " + nationality);
    }
}

class Srilankan extends InternationalTraveller {
    public Srilankan() {
        super("Srilanka");
    }

    public void printSummary() {
        System.out.println("Vanakkam. I am from SL");
    }
}


class Chinese extends InternationalTraveller {
    public Chinese() {
        super("China");
    }

    public void printSummary() {
        System.out.println("I am from China");
    }
}

class American extends InternationalTraveller {
    public American() {
        super("America");
    }

    public void printSummary() {
        System.out.println("HOwdy !!! I am an American");
    }
}