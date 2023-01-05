package Abstraction.AbstractClass.Inheritance.MultiLevel;

public class BMWx7 extends BMW{

    public void drift(){
        super.price();
        System.out.println("Awesome");
    }

    public static void main(String[] args) {
        BMWx7 bx7 = new BMWx7();
        bx7.drift();

    }
}
