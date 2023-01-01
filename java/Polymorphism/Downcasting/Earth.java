package Polymorphism.Downcasting;

public class Earth {

    public static void main(String[] args) {
         Animal animal = new WhiteLion();

//         During down-casting cast() operator is mandatory
         Lion lion = (Lion)animal;

         WhiteLion whitelion = (WhiteLion)lion;

        System.out.println(animal);
        System.out.println(whitelion);
        System.out.println(lion);

    }
}
