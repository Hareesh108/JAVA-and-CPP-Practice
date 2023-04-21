public class Main {
    int a;
    int b;
    Main(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor");
    }
    public void demo(){
        System.out.println("Non Static Method");
    }
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println("Non static block");
    }
    public static void main(String[] args) {
        Main obj = new Main(10,20);
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.demo();
    }
}
