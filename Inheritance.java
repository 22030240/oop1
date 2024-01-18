public class Inheritance {
    public static void main(String[] args) {
        fish f = new fish();
        // f.eat();
        // f.pair();
        f.fish();
        f.name = "akshau";
        System.out.println(f.name);

    }
}
// inheritance is when properties and method of base class passed on derived
// class;
// parent->child->grand-son
// single level inheritance
// based class -> derived class

class Animal {
    String name;

    void eat() {
        System.out.println("Animal eats grass");

    }

    void pair() {
        System.out.println("have four pair");
    }
}

class fish extends Animal {
    void fish() {
        System.out.println("fish live in water");
    }
}
