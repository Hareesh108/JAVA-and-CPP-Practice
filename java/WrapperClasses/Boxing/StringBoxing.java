package WrapperClasses.Boxing;

public class StringBoxing {
    public static void main(String[] args) {
//        When primitive to String, we are not able to perform directly conversion.
//        SO, we have to use static method valueOf()
        int i = 100;
        String obj1 = String.valueOf(i);
        System.out.println(obj1.toString());

        byte b = 25;
        String obj2 = String.valueOf(b);
        System.out.println(obj2);

        short s = 25;
        String obj3 = String.valueOf(s);
        System.out.println(obj3);

        long l = 25;
        String obj4 = String.valueOf(l);
        System.out.println(obj4);

        float f = 25.55f;
        String obj5 = String.valueOf(f);
        System.out.println(obj5);

        double d = 25.584;
        String obj6 = String.valueOf(d);
        System.out.println(obj6);

        char c = 'a';
        String obj7 = String.valueOf(c);
        System.out.println(obj4);

        boolean bb = false;
        String obj8 = String.valueOf(bb);
        System.out.println(obj8);
    }
}
