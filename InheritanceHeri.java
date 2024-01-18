
// herachical inheritance
import java.util.*;

public class InheritanceHeri {
    public static void main(String[] args) {
        cat c = new cat();
        c.legs();
        c.mau();
        Dog d = new Dog();
        d.eat();

    }

}

class Animal {
    String name;

    void eat() {
        System.out.println("eats.......");
    }

    void legs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many legs have a this animal");
        int leg = sc.nextInt();
        System.out.println("have " + leg + "leg");

    }
}

class Dog extends Animal {
    int dogbody;

    void broke() {
        System.out.println("broke_>>>....__..");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim......");
    }
}

class cat extends Animal {
    void mau() {
        System.out.println("mau.......");
    }
}
