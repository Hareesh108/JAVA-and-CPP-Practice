package ExceptionHandling.Finally;

public class Check2 {
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
            try {
                int res = a/b;
            }catch (ArithmeticException n){
                System.out.println(n);
            }
        }
        System.out.println("Worked");
    }
}
