package Inheritance.SuperAndThis.This;

public class Parent extends Grand {


    Parent(){
        this(10,20);
        System.out.println("Parent()");
    }

    Parent(int num,int num1){
        System.out.println("Parent Parameter");
    }
}
