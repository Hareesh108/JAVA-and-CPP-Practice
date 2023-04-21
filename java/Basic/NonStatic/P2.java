package NonStatic;

public class P2 {
    static int a = 20;

    static {
        System.out.println("Hello, P2 here");
        add();
        a = 100;
    }
    public static void add(){
        System.out.println("Staic add method");
        a = 50;
    }

    public static void main(String[] args) {

        System.out.println("P2 class");
    }
}
