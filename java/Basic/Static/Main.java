package Static;

public class Main {
    static int a;

    static {
        a = 70;
        System.out.println(a);
        int a = 100;
        System.out.println(a);
        System.out.println(Main.a);
    }

    public static void main(String[] args) {
        a = 20;
        System.out.println(a);
        int a = 30;
        System.out.println(a);
        a = 40;
        System.out.println(a);
        System.out.println(Main.a);
        int b = 60;
        System.out.println(b);
        System.out.println(Main.b);
    }
    static int b = 50;

    public static void test(int num){
        System.out.println("Test Method start");
        System.out.println(num);
        int b = 100;
        int c = 900;
        System.out.println(b+c);
        a = 500;
        System.out.println(Demo.a);
    }
}
