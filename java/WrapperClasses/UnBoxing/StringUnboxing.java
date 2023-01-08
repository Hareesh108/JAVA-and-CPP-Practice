package WrapperClasses.UnBoxing;

public class StringUnboxing {
    public static void main(String[] args) {

//        Directly not possible we have use

        String obj1 = "123";
        int i = Integer.parseInt(obj1);
        System.out.println(i);

        String obj2 = "23";
        byte b = Byte.parseByte(obj2);
        System.out.println(b);

        String obj3 = "23";
        short s = Short.parseShort(obj3);
        System.out.println(s);

        String obj4 = "23";
        long l = Long.parseLong(obj4);
        System.out.println(l);

        String obj5 = "23.52";
        float f = Float.parseFloat(obj5);
        System.out.println(f);

        String obj6 = "23.25";
        double d = Double.parseDouble(obj6);
        System.out.println(d);

//        Not possible in java unboxing
//        String obj7 = "a";
//        char c = Character.parseCharacter(obj7);
//        System.out.println(c);

        String obj8 = "true";
        boolean bb = Boolean.parseBoolean(obj8);
        System.out.println(bb);
    }
}
