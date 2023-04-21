package NonStatic;

public class Check {
    static int a = 10;
    int b = 50;
    static {
        int c = 135;
        System.out.println(c);
    }
    public static void add(){
        System.out.println("Static method Start");
        Check obj = new Check();
        System.out.println(obj.b);
        System.out.println(obj.a);
        System.out.println("Static method end");
    }
    public static void main(String[] args) {
        System.out.println("Static Main method Start");
        add();
        Check obj = new Check();
        System.out.println(obj.b);
        System.out.println(obj.a);
    }
}
