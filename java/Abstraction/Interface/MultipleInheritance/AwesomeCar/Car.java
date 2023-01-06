package Abstraction.Interface.MultipleInheritance.AwesomeCar;

import Abstraction.Interface.MultipleInheritance.Car.Brake;
import Abstraction.Interface.MultipleInheritance.Car.Engine;
import Abstraction.Interface.MultipleInheritance.Car.Media;

public class Car implements Engine, Brake, Media {

    int a = 30;

    @Override
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Car");
    }
}

