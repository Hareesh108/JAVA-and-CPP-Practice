package Polymorphism.Overriding.MultiLevel;

public class Child extends Parent{

    public void test(){
        System.out.println("test() Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.test();

        Grand g = c;
        g.test();
    }
}
