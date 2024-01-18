// multi level inheritance


public class InheritanceMulti {
    public static void main(String[] args) {
        Fish f = new Fish();
        System.out.println("_______________________________________");
        f.eat();
        f.ha();
        f.name = "Akshay";
        System.out.println(f.name);

    }

}

class Animal {
    String name;

    void eat() {
        System.out.println("eat......");
    }

    void nacho() {
        System.out.println("nacho..................");
    }
}

class Mammels extends Animal {
    int leg;

    void Mammels() {
        System.out.println("mammels................");
    }

    void khel() {
        System.out.println("khel kabbadi--------");
    }
}

class Fish extends Mammels {
    int gaon;

    void ha() {
        System.out.println("ha________________________");
    }
}