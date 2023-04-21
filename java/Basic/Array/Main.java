package Array;

public class Main {
    public static void main(String[] args) {
        //Initialization or Declaration
        int arr1[] = {1,2,3,4};
        int []arr2 = {1,2,8,4};
        System.out.println(arr1 + " " + arr2);
        System.out.println(arr1[0]);
        //Using NEW Keyword
        int[] arr3 = new int[5];
        System.out.println(arr3);

        //Define empty array
        int[] arr4 = null;
        System.out.println(arr4);
//        System.out.println(arr4.length); //Runtime error

        String[] arr5 = {null,null};
        System.out.println(arr5);
        System.out.println(arr5[1]);
        System.out.println(arr5.length);

        float[] a = new float[5];
        System.out.println(a);

        boolean[] b = new boolean[5];
        System.out.println(b);
        b[0]=true;
        System.out.println(b[1]=false);

    }
}
