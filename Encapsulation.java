// Encapsulation is define as the wrapping up of data & method under a single unit .it also implement data hiding;
//constuctor is special method which is involked automatically at the time of object creation.

// constructor have the same name as class and structure.
//constructor dont have return value
//constructor are only called once.
// memory allocation is happen when constructor is called.

public class Encapsulation {
    public static void main(String[] args) {
        // student s = new student("akshay", 34);
        // System.out.println("name of the student is ->>" + s.name);
        // System.out.println("id of the student is->>" + s.id);

        student s = new student("akshau");

        student s1 = new student(s);
        System.out.println(s1.id);
        System.out.println(s1.name);
    }

}

class student {
    String name;
    int id;

    student(String name) {
        this.name = name;
        // this.id = id;

    }

    student(student s) {
        this.id = id;
        this.name = name;
    }

    student() {
        System.out.println("my name is akshay");
    }
}
// their are three type of constructor
// 1 non parameterized
// 2parameter
// copy constructor
// their are two type of copy cons
//1
 //shallow->refrences
 // deep->
