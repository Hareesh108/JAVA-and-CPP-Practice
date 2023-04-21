package NonStatic;

public class P1 {

    public static void main(String[] args) {
        System.out.println("P1 class");

        P1 obj = new P1();

        P2 obj1 = new P2();
        System.out.println(obj1.a);
    }
}
