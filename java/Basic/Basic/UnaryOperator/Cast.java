package Basic.UnaryOperator;

public class Cast {

    public static void main(String[] args) {

        //Widening
//        // 1) int to other
//        int a = 5;
//        long b = a;
//        double c = a;
//        float d = a;
//        int e = a;
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

//        5
//        5.0
//        5.0
//        5

        // 2) char to other
        char a =  'a';
        long b = a;
        double c = a;
        float d = a;
        int e = a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

//        // 3) boolean to other we cannot do operation because its keywords
//        boolean a = true;
//        long b = a;
//        double c = a;
//        float d = a;
//        int e = a;
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

//        //Narrowing
//        long p = 65;
//        //Working without cast
//        float x = p;
//        double y = p;
//        System.out.println(x);
//        System.out.println(y);
//
//        //Not working without cast
//        int q = (int) p;
//        short r =(short) p;
//        byte s = (byte) p;
//        char z = (char) p;
//        byte k = (byte) p;
//        System.out.println(q);
//        System.out.println(r);
//        System.out.println(s);
//        System.out.println(z);
//        System.out.println(k);

        double p = 65;
        long x = (long) p;
        double y = p;
        System.out.println(x);
        System.out.println(y);
        int q = (int) p;
        short r =(short) p;
        byte s = (byte) p;
        char z = (char) p;
        byte k = (byte) p;
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        System.out.println(z);
        System.out.println(k);

    }
}
