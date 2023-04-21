package NonStatic;

//public class MyClass {
//    int x;
//
//    {
////        MyClass obj = new MyClass();
////        System.out.println(obj.x);
//        System.out.println(x); //0
//    }
//    public MyClass(int x) {
//        // Use the "this" keyword to disambiguate the "x" parameter from the
//        // instance variable "x"
//        System.out.println(x); //10
//        this.x = x;
//        x = 50;
//        System.out.println(this.x); //10
//        System.out.println(x); //50
//    }
//
//    public int setX(int x) {
//        // Use the "this" keyword to disambiguate the "x" parameter from the
//        // instance variable "x".
//        this.x = x;
//
//        return 0;
//    }
//
//    public int doSomething() {
//        // Pass the current object as an argument to the myMethod() method.
//        myMethod(this);
//        return 0;
//    }
//
//    public void myMethod(MyClass arg) {
//        System.out.println(arg);
//    }
//
//    public MyClass getThis() {
//        // Return the current object from the method.
//        return this;
//    }
//
//    static {
//        MyClass obj = new MyClass(10);
//        System.out.println(obj.x);
//        System.out.println(obj.doSomething());
//
//        System.out.println(obj.getThis());
//
//        System.out.println(obj.setX(20));
//        System.out.println(obj.x);
//
//    }
//
////    public static void add(){
////        MyClass obj = new MyClass(10);
////        System.out.println(obj.x);
////        System.out.println(obj.doSomething());
////
////        System.out.println(obj.getThis());
////
////        System.out.println(obj.setX(20));
////    }
//
//    public static void main(String[] args) {
////        add();
//
////        MyClass obj = new MyClass();
////        System.out.println(obj.x);
//    }
//}


public class MyClass {
    private int num;
    private int num1;

    int x;
    int y;

    public MyClass(int x, int y) {
        // In this constructor, the "this" keyword is used to differentiate
        // between the instance variables and the method parameters.
        num = x;
        num1 = y;

        this.x = x;
        this.y = y;
    }

    public int printXY() {
        // The "this" keyword is used here to call the printXY() method
        // on the current object.
        this.printX();
        return 0;
    }

    public void printX() {
        // The "this" keyword is used here to call the printXY() method
        // on the current object.
        System.out.println("hello");
    }

    public static void main(String[] args) {
            MyClass obj = new MyClass(10,20);
            System.out.println(obj.num);
            System.out.println(obj.num1);
            System.out.println(obj.x);
            System.out.println(obj.y);
            obj.printXY();
    }
}


