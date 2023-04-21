package NonStatic;

public class Loading {
    int a ;
    static int b;

    static {
        b = 50;
    }
    {
        System.out.println("Hello, Nonstatic Block");
    }

    Loading(int a){
        this.a = a;
    }

    public int setA(int a) {
        this.a = a;
        return 0;
    }

    public static void main(String[] args) {
        Loading obj = new Loading(100);
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.setA(200);
        System.out.println(obj.a);

        Loading obj1 = new Loading(1000);
        System.out.println(obj1.a);

    }
}
