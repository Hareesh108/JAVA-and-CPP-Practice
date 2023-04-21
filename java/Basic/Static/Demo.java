package Static;

public class Demo {
    static int a;

    static {
        System.out.println("From Static Method");
        Main.test(100);
    }

    public static void main(String[] args) {
        System.out.println("From Main method");
        a = 90;
        System.out.println(a);
//        test(200);

    }
//    public static void test(int num){
//        System.out.println("Test Method start");
//        System.out.println(num);
//        int b = 100;
//        int c = 900;
//        System.out.println(b+c);
//        a = 500;
//        System.out.println(Demo.a);
//    }
}
