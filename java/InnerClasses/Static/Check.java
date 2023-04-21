package InnerClasses.Static;

public class Check {
    int num = 100;
    static int num1 = 200;
    static class  Inner {
        int a = 20;
        static int b = 40;

        public static void demo(){
            System.out.println(b);
            System.out.println(num1);
            System.out.println("Static method");
        }

        public void test(){
            System.out.println(a);
//            System.out.println(Check.this.num); //Not allowed
            System.out.println("Non Static Method");
        }

        public static void main(String[] args) {
            demo();
            Inner i = new Inner();
            i.test();
        }

    }
    public static void main(String[] args) {

    }
}
