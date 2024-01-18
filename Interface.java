
// interfaces is a blueprint of 
import java.util.*;

//multiple inheritance ko banan ke liye interface use karte hai.
//total abstraction
public class Interface {
    public static void main(String[] args) {
        orangeapple o = new orangeapple();
        o.apple();

    }
}

interface Animal {
    void apple();

}

class blackapple implements Animal {
    public void apple() {
        System.out.println("back apple");
    }

    blackapple() {
        System.out.println("blackapple  --- called");
    }
}

class orangeapple implements Animal {
    public void apple() {
        System.out.println("orangeapple--");
    }

    orangeapple() {
        System.out.println("orangeapple alled---");
    }
}
