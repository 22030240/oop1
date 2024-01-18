public class getset {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setname("Akshay");
        System.out.println(a.getname());
        a.setheight(100);
        System.out.println("height is->>" + a.getheight());
        a.setname("hariom");
        System.out.println(a.getname());

    }

}

class Animal {
    private String name;
    private int height;

    String getname() {
        return this.name;
    }

    void setname(String newname) {
        this.name = newname;
    }

    int getheight() {
        return this.height;
    }

    void setheight(int newheight) {
        this.height = newheight;
    }

}
