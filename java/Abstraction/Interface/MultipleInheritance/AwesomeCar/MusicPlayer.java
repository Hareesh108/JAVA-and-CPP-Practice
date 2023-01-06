package Abstraction.Interface.MultipleInheritance.AwesomeCar;

import Abstraction.Interface.MultipleInheritance.Car.Media;

public class MusicPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
