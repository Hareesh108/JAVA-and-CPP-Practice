package Inheritance.SuperAndThis.This;

public class Child extends Parent {

    Child(int num){
        super();
        System.out.println("Child(Argument)");
    }

    Child(){
        this(12);
        System.out.println("Child()");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }

}
