package ExceptionHandling.tryCatch;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = null;
        try {
            System.out.println(arr.length);
            int res = a/b;
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
