package WrapperClasses.Boxing;

public class Boxing extends Object{

    public static void main(String[] args) {
//        When primitive to Non-primitive w r t their class name we can perform directly conversion (AutoBoxing).
//        and we have to use static method valueOf()
//        Integer
        int i = 100;
        Integer obj1 = i;
//        Integer obj1 = Integer.valueOf(i);
        System.out.println(obj1.toString());

        byte b = 25;
        Byte obj2 = Byte.valueOf(b);
        System.out.println(obj2);

        short s = 25;
        Short obj3 = Short.valueOf(s);
        System.out.println(obj3);

        long l = 25;
        Long obj4 = Long.valueOf(l);
        System.out.println(obj4);

        float f = 25.55f;
        Float obj5 = Float.valueOf(f);
        System.out.println(obj5);

        double d = 25.584;
        Double obj6 = Double.valueOf(d);
        System.out.println(obj6);

        char c = 'a';
        Character obj7 = Character.valueOf(c);
        System.out.println(obj4);

        boolean bb = false;
        Boolean obj8 = Boolean.valueOf(bb);
        System.out.println(obj8);

    }
}
