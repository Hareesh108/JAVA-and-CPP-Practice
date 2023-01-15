package ExceptionHandling.Exception.Nested;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int[] arr = null;

        try {
            try {

                System.out.println(arr.length);
            }
            catch (NullPointerException n){
                System.out.println(n);
            }
            int res = a/b;
        }
        catch (ArithmeticException n){
            System.out.println(n);
        }
        System.out.println("Worked");
    }
}
