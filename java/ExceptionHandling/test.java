package ExceptionHandling;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        Throwable;
//
//        ArrayIndexOutOfBoundsException


        int[] arr = new int[5];
        arr[1] = 12;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

//        Arrays ab = new Arrays();

//        int a = new int();

        int[] arr1 = new int[2];
        System.out.println(arr1.toString());

        String[] arr4 = new String[5];
        System.out.println(arr4);

        String[] arr9 = new String[5];
        System.out.println(arr9.toString());

        boolean[] arr5 = new boolean[5];
        System.out.println(arr5.toString());

        char[] arr6 = new char[5];
        System.out.println(arr6.toString());

        double[] arr7 = new double[5];
        System.out.println(arr7.toString());

//        int[] arr2 = {21,25,48,78};
////        arr2 = arr1;
////        arr1 = arr2;
//        System.out.println(arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr1));
//
        test a = new test();
        System.out.println(a.toString());
    }
}
