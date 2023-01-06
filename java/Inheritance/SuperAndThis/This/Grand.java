package Inheritance.SuperAndThis.This;

public class Grand {

    Grand(int num, int num1){
        super();
        System.out.println("Grand() Parameter");
    }

    Grand(){
        this(50,23);
        System.out.println("Grand()");
    }
}
