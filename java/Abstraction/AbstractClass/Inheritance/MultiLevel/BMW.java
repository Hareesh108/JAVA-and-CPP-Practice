package Abstraction.AbstractClass.Inheritance.MultiLevel;

import Inheritance.Multilevel.Car;

abstract class BMW extends Cars {

    public void price(){
        System.out.println("Price of BMW is: 1.1cr");
    }

    abstract public void drift();
}
