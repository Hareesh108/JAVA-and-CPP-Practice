package Polymorphism.Overriding.AnimalDog;

public final class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public static void main(String[] args) {

        Animal a = new Animal();    // a is a reference to an Animal object
        Animal b = new Dog(); // b is a reference to a Dog object
        a.makeSound();
        b.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Animal a1 = d;
        a1.makeSound();

    }
}
