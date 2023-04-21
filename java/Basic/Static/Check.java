package Static;

public class Check {

    static int a;

    int ab = 100;

    static int c;

    static String d;

    public static void add(){
        System.out.println("Static Method");
    }

    public void add1(){
        System.out.println("Nonstatic");
    }

    static {
        a = 50;
        System.out.println("Static Block " + a);
    }

    public static void main(String[] args) {
        add();

        Check obj = new Check();
        obj.add1();

    }
}
