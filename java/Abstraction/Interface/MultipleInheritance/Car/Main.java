package Abstraction.Interface.MultipleInheritance.Car;


public class Main {
    public static void main(String[] args) {
        Engine car = (Engine) new Car();
//        We cant access
//        car.a;
        car.acc();
        car.start();
        car.stop();

        Media carMedia = (Media) new Car();
        carMedia.stop();

    }
}
