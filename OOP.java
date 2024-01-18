import java.util.*;

public class OOP {
    public static void main(String[] args) {
        Name n = new Name();
        n.name();
        n.getbalance(500);
        System.out.println(n.getbalance);

        Animal a = new Animal();
        a.getheight(27);
        System.out.println(a.height);
        a.name("Dange");
        System.out.println(a.name);

    }
}

class Name {
   public String name;
    int getbalance;

    void name() {
        System.out.println("Enter the name of student:->");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("name of the student is-->>" + name);

    }

    void getbalance(int balance) {
        getbalance = balance;
    }

}

class Animal {
    String name;
    int height;

    void name(String getname) {
        name = getname;
    }

    void getheight(int high) {
        height = high;
    }
}