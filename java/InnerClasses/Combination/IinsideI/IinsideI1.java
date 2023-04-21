package InnerClasses.Combination.IinsideI;

public class IinsideI1 implements Outer.Inner{
    public void test2(){
        System.out.println("Inner");
    }

    public static void main(String[] args) {
        Outer.Inner obj = new IinsideI1();
        obj.test2();
    }
}
