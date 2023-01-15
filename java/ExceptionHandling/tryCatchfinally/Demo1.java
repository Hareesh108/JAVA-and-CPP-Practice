package ExceptionHandling.tryCatchfinally;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = null;
        try {
            try {

                System.out.println(arr.length);
            }
            finally {
                System.out.println("Inner finally");
            }
            int res = a/b;
        }
        catch (ArithmeticException n){
            System.out.println(n);
        }
        catch (NullPointerException n){
            System.out.println(n);
        }
        finally {
            System.out.println("Outer finally");
        }

        System.out.println("Worked");
    }
}
