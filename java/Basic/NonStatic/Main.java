package NonStatic;

public class Main {
    static int n = 50;
    int a = 10;
    float b = 100;
    char c = 'c';
    String str = "Hareesh";
    boolean s = false;
    public void add(){
        System.out.println("This is add method");
        System.out.println(a);

        Main obj1 = new Main();
        System.out.println(obj1.a);
        System.out.println(n);
        System.out.println(Main.n);
        System.out.println(obj1.n);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.add();
        System.out.println("This is main method");
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.str);
        System.out.println(obj.s);

//        // We cant access not static member directly and class reference
//        System.out.println(a);
//        System.out.println(Main.a);
    }
}
