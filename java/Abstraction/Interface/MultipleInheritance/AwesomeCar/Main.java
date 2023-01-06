package Abstraction.Interface.MultipleInheritance.AwesomeCar;

public class Main {
    public static void main(String[] args) {
        AwesomeCar car = new AwesomeCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
