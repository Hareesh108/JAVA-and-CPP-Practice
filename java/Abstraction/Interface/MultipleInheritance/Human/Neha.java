package Abstraction.Interface.MultipleInheritance.Human;

public class Neha implements Boy,Girl{

    public void speak(){
        System.out.println("Neha is Speaking");
    }

    public void dance(){
        System.out.println("Neha is Dancing");
    }

    public static void main(String[] args) {
        Neha n = new Neha();
        n.speak();
        n.dance();

        Girl g = n;
        g.speak();
    }
}
