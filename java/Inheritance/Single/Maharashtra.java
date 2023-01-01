package Inheritance.Single;

public class Maharashtra extends State{

    int n = 20;

    public void test(){
        System.out.println("Maharashtra class method");
    }

    Maharashtra(){
        System.out.println("Maharashtra constructor");
    }

    public static void main(String[] args) {
        Maharashtra obj = new Maharashtra();

        System.out.println(obj.n);
        System.out.println(obj.a);
        obj.test();
        obj.demo();
    }
}
