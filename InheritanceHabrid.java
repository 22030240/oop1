import java.util.*;

public class InheritanceHabrid {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.dog();
        d.leg();
        Fish f = new Fish();
        f.eat();
        f.fish();
    }

}

class Animal {
    void eat() {
        System.out.println("animal eats....");
    }

    void leg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter leg..");
        int leg = sc.nextInt();
        System.out.println("Animal have -> " + leg + "  ||");

    }
}

class Dog extends Animal {
    void dog() {
        System.out.println("dog _____________");
    }
}

class pappy extends Dog {
    void dogeat() {
        System.out.println("dogeat------.....--");
    }
}

class chodakuta extends Dog {
    void chodakuta() {
        System.out.println("chotakuta.......");
    }
}

class Fish extends Animal {
    void fish() {
        System.out.println("fish eat");
    }
}

class Shark extends Fish {
    void Shark() {
        System.out.println("shark-------");
    }
}

// multiple inheritance are not use in a oop it use in a cpp
//multiple inheritance are use as multiple interfaces