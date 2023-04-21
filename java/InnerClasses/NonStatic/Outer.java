package InnerClasses.NonStatic;

public class Outer {

    class Inner {
        public  void test(){
            System.out.println("Inner class method");
        }
    }

    public  void demo(){
        System.out.println("Outer class method");
//        Access from non static area in this way
        Inner i = new Inner();
        i.test();
    }



    public static void main(String[] args) {
//        Access from static area or We can also access from another class from this way
        Outer o = new Outer();
//        o.test(); we can not do this
        o.demo();
        Outer.Inner i = o.new Inner();
        i.test();

    }

}
