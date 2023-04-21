package ExceptionHandling.Custom;

import java.util.Scanner;

public class Vote {

    public static void Voter(int age) throws InvalidAge{
        if(age >= 18){
            System.out.println("You can Vote");
        }
        else {
//            It is nor right way define exception,
//            throw new ArithmeticException("Not Eligible");

//            Custom Exception
            throw new InvalidAge("Not Eligible");
        }
    }

    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();

        int age = 13;

        try{
            Voter(age);
        }
        catch (Throwable o){
            System.out.println(o);
        }
    }
}
