package WrapperClasses.ObjectCreate;

public class Demo {

    public static void main(String[] args) {
        //1
        Integer wrapperInt = Integer.valueOf(42);
        System.out.println(wrapperInt);
        //2
        Integer wrapperInt1 = new Integer(42);
        System.out.println(wrapperInt1);
        //3
        String str = "123";
        Integer wrapperInt2 = Integer.parseInt(str);
        System.out.println(wrapperInt2);
        //4
        int primitiveInt = 42;
        Integer wrapperInt3 = primitiveInt;
        System.out.println(wrapperInt3);

        Byte b = new Byte((byte)42);
        System.out.println(b);

        Short s = new Short((short)42);
        System.out.println(s);

        Long l = new Long(42);
        System.out.println(l);

        Float f = new Float(42.22);
        System.out.println(f);

        Double d = new Double(42.258);
        System.out.println(d);

        Character c = new Character('a');
        System.out.println(c);

        Boolean bb = new Boolean(true);
        System.out.println(bb);


    }


}
