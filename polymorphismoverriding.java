//method overriding
//parent and child classes both contain the same function with a different definition
// run time 
public class polymorphismoverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat();
    }

}

class Animal {
    void eat() {
        System.out.println("eat grass___");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eat hadi");
    }
}
