package AccessModifiers.Private;

public class Child extends Parent{
//    private int a =20;
    private Child(){
        this(12);
        System.out.println("Constructor");
    }

    Child(int num){
        super();
    }

    private static void test(){
        System.out.println("test");
    }
    public static void main(String[] args) {

    }
}
