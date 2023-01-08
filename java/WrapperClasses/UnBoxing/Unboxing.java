package WrapperClasses.UnBoxing;

public class Unboxing {
    public static void main(String[] args) {

        Integer obj1 = 123;
//        Directly
//        int i = obj1;
//        Using ...Value()
        int i = obj1.intValue();
        System.out.println(i);

        Byte obj2 = 23;
//        byte b = obj2;
        byte b = obj2.byteValue();
        System.out.println(b);

        Short obj3 = 23;
        short s = obj3.shortValue();
        System.out.println(s);

        Long obj4 = 23L;
        long l = obj4.longValue();
        System.out.println(l);

        Float obj5 = 23.52f;
        float f = obj5.floatValue();
        System.out.println(f);

        Double obj6 = 23.25;
        double d = obj6.doubleValue();
        System.out.println(d);

        Character obj7 = 'a';
        char c = obj7.charValue();
        System.out.println(c);

        Boolean obj8 = true;
        boolean bb = obj8.booleanValue();
        System.out.println(bb);

    }

}
