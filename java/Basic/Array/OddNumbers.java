package Array;

public class OddNumbers {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int [] arr1 = {3,4,6,7,1,3,8};
        int a = 0;

        for (int index = 0; index < arr.length; a++) //a++ here we are updating the values
        {
            if( a % 2 != 0){
                // First assign the value to the index then increment index by one.
                arr[index++] = a;
            }
        }

        for (int ind = 0; ind< arr.length;ind++){
            System.out.println(arr[ind]);
        }

        int count = 0;
        for (int i=0; i<arr1.length;i++){
            if(arr1[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("Count of Odd number: " + count);
    }
}
