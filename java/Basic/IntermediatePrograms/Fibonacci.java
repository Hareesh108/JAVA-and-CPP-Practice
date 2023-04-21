package IntermediatePrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<num-2;i++)
        {
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
