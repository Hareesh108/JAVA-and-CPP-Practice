package DataType.Short;

public class Check {
    //    public static byte test(int num) {
//        byte num1 =(byte) num;
//        return num1;
//
//    }

    public static int test(short num) {
        int num1 = num;
        return num1;

    }

    public static void main(String[] args) {
//        byte n = test(230);
//        System.out.println(n);

        int n = test((short) 5880);
        System.out.println(n);
    }
}
