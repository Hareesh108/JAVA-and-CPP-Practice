package Polymorphism.Upcasting;

public class Earth {

    public static void main(String[] args) {
        WhiteTiger white = new WhiteTiger();

        Tiger tiger = white;

        Animal animal1 = tiger;
        Animal animal2 = white;

        System.out.println(white);
        System.out.println(tiger);
        System.out.println(animal1);
        System.out.println(animal2);;

//        Animal obj1 = new WhiteTiger();

    }
}
