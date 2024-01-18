
//super keyword is used to refer immediate parent class object.
// to access parent properties , function, and access parent constructor
public class superkeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.name);
    }
}

class Animal {
    String name;

    Animal() {
        System.out.println("animal constructor is called--");
    }
}

class Horse extends Animal {

    Horse() {
        super.name = "akshau";
        System.out.println("Horse constructor is called--");
    }
}