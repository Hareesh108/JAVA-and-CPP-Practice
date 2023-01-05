package Abstraction.AbstractClass.CallParentMethod;

class Dog extends Animal {
    @Override
    public void move() {
        // calls the move() method of the Animal class
        System.out.println("Dog is moving");
        super.move();
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
    }
}
