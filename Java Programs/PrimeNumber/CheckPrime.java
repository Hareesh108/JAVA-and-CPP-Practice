package PrimeNumber;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        boolean flage = true;
        for (int i = 2; i< num/2; i++)
        {
            if (num % i == 0){
                flage = false;
                System.out.println("This is not a number");
                break;
            }
        }
        if(flage == true)
        {
            System.out.println("This is prime number");
        }
    }
}
