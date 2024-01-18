// ABstraction
// Hiding all the unnecessary details and showing only the important part of the user.
//1.Abstraction

// cannot create an instance of abstract class
// can have abstraction and not abstraction method
// can have constructors
//2.Interfaces
public class Abstraction {
    public static void main(String[] args) {
        mallu m = new mallu();

    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal class called....");
    }

    void eat() {
        System.out.println("eat.....anything");
    }

    abstract void leg();
}

class Dog extends Animal {
    void leg() {
        System.out.println("dog have 4 legs");
    }

}

class Horse extends Animal {
    void leg() {
        System.out.println("horse also have 4 leg");
    }

    Horse() {
        System.out.println("horse constructor called.. ");
    }
}

class mallu extends Horse {
    mallu() {
        System.out.println("mallu constructor called---");
    }
}
