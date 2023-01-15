package ExceptionHandling.tryCatchfinally;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = null;
        try {
            System.out.println(arr.length);
            try {
                int res = a/b;
            }
            finally {
                System.out.println("Inner finally");
            }

        }
        catch (ArithmeticException n){
            System.out.println(n);
        }
        catch (NullPointerException n){
            System.out.println(n);
        }
        System.out.println("Worked");
    }
}
