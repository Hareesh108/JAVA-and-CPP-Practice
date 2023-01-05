package Abstraction.AbstractClass.IndirectObjectCreation;

public abstract class Bank {
//    this way we can crete an object. but if least one method is available in this class even not possible
//    in below way
    Bank(int num){
        System.out.println("Bank()");
    }
    public static void main(String[] args) {
        Bank s = new Bank(12) {};
    }

}
