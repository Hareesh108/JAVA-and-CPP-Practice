package Abstraction.AbstractClass.Inheritance.MultiLevel;

import Inheritance.Multilevel.Car;

public abstract class BMW extends Car {

    public void price(){
        System.out.println("Price of BMW is: 1.1cr");
    }

    abstract public void drift();
}
