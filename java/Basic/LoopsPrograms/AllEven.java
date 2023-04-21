package LoopsPrograms;

public class AllEven {
    public static void main(String[] args) {
        // Even number between 0 to 20
        int n = 0;
        System.out.println("Even number between 0 to 20 : ");
        while(n < 25){
            if(n % 2 == 0){
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println();
        //divisible by 3 and 7 between 0 to 200;
        int m = 0;
        System.out.println("divisible by 3 and 7 between 0 to 200 : ");
        while(m <= 200){
            if(m % 3 == 0 && m % 7 == 0 ) {
                System.out.print(m + " ");
            }
            m++;
        }

    }
}
