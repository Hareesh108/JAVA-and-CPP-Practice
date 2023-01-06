package Inheritance.SuperAndThis.Super;

public class Child extends Parent{

    int a = 20;

    Child(){
        super(); //this default super() call
        System.out.println("Child");
        super.test();
    }

}
