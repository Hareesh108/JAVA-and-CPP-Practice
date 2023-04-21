import java.util.Scanner;


public class Main2 {
    int a;
    int b;
    Main2(int a, int b){
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
        Main2 obj = new Main2(10,20);
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.demo();
    }
}
