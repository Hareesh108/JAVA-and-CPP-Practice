package ExceptionHandling.Finally;

public class Check3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int res = a/b;
        }
        catch (ArithmeticException n){
            System.out.println(n);
        }
        finally {
            int res = a/b;
        }
        System.out.println("Worked");
    }
}
