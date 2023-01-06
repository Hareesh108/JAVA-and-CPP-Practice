package Abstraction.Interface.MultipleInheritance.AwesomeCar;

import Abstraction.Interface.MultipleInheritance.AwesomeCar.ElectricEngine;
import Abstraction.Interface.MultipleInheritance.AwesomeCar.MusicPlayer;
import Abstraction.Interface.MultipleInheritance.AwesomeCar.PetrolEngine;
import Abstraction.Interface.MultipleInheritance.Car.Engine;
import Abstraction.Interface.MultipleInheritance.Car.Media;

public class AwesomeCar {
    private Abstraction.Interface.MultipleInheritance.Car.Engine engine;
    private Media player = new MusicPlayer();

    public AwesomeCar() {
        engine = new PetrolEngine();
    }

    public AwesomeCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
