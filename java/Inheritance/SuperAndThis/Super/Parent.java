package Inheritance.SuperAndThis.Super;

public class Parent extends Grand{

    public void test(){
        System.out.println("Parent test()");
        System.out.println(super.b);
    }

    Parent(){
        super(10,20);
        System.out.println("Parent()");
    }
}
