package Static;

public class Loading {
    static int  a = 50;
    static int b;

    static {
        b = 100;
        System.out.println(b);
        int a = 1000;
        System.out.println(a);
        System.out.println(Loading.a);
        test(b);
    }
    public static void test(int num){
        int x = 10;
        int y = 20;
        System.out.println(x+y);
        System.out.println(num);
    }
    public static void main(String[] args) {
    }
}
