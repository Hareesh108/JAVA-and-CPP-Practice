package Abstraction.Interface.MultipleInheritance.Human;

public class Kumar implements Boy,Girl{

    public void speak(){
        System.out.println("Kumar is Speaking");
    }

    public void dance(){
        System.out.println("Kumar is not a dancer");
    }

    public static void main(String[] args) {
        Kumar n = new Kumar();
        n.speak();
        n.dance();

        Boy b = n;
        b.speak();

        Girl g = n;
        g.speak();
    }
}
