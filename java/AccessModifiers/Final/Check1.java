package AccessModifiers.Final;

public final class Check1{
//    Initialization is mandatory for static variable
//    static final int c;

//    Initialization is mandatory for non static variable in Constructor
    final int a;

    static {
        System.out.println("Hello");
    }
    public Check1(int n) {
        this.a = n;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Check1 a = new Check1(12);
//        a.a = 25; not possible
    }
}
