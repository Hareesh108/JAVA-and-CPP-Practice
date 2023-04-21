package DataType.byteDT;

public class Check {

//    public static byte test(int num) {
//        byte num1 =(byte) num;
//        return num1;
//
//    }

    public static int test(byte num) {
        int num1 = num;
        return num1;

    }

    public static void main(String[] args) {
//        byte n = test(230);
//        System.out.println(n);

        int n = test((byte) 130);
        System.out.println(n);

        byte num = 100;
        System.out.println(num);
        byte num2 = -100;
        System.out.println(num2);

        byte num1 = (byte) 130;
        System.out.println(num1);

        int a = 10;
        int b = 20;
//        int temp = a;
//        a = b;
//        b = temp;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a + " " + b);



    }

}
