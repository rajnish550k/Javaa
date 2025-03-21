package Java;
class Encapsulation { // user-defined class

    private String name = "RAJNISH";

    public String getName() {
        return name;
    }

}

public class EncapsulationDemo { // main class with a different name

    public static void main(String[] args) { // main method
        Encapsulation obj = new Encapsulation(); // Object of Encapsulation class
        System.out.println("My name: " + obj.getName());
    }

}

