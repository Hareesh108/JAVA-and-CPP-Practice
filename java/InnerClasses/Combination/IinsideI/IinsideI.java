package InnerClasses.Combination.IinsideI;

public class IinsideI implements Outer{

    public void test1(){
        System.out.println("outer");
    }
    public static void main(String[] args) {

        Outer obj = new IinsideI();
        obj.test1();
    }
}
