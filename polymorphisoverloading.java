// multiple function with the same name but different parameter
// compile time 
public class polymorphisoverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("sum of int ->" + c.sum(12, 12));
        System.out.println("sum of float->" + (float) c.sum((float) 1.3, (float) 5.6));
        System.out.println("sum of double->" + c.sum(1.2, 5.66));
        System.out.println("sum of int 3->" + c.sum(23, 45, 67));
    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
