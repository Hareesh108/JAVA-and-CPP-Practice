package Array;

public class PosNegNumbers {
    public static void main(String[] args) {
        int[] arr = {2,1,-5,9,-2,5,-5,-54,20};

        int positive = 0;
        int negative = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] >= 0){
                positive++;
            }
            else negative++;
        }
        System.out.println("Positive :- " + positive + " " + "Negative:- "+ negative);
    }
}
