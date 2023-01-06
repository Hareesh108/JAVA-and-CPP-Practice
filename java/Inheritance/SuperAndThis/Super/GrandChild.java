package Inheritance.SuperAndThis.Super;

public class GrandChild extends Child{

    GrandChild(){
        super();
        System.out.println(super.a);
        System.out.println("GrandChild()");
    }

    public static void main(String[] args) {
        GrandChild c = new GrandChild();

    }
}
