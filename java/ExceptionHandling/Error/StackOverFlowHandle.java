package ExceptionHandling.Error;

public class StackOverFlowHandle {
    static int count = 1;
    public static void main(String[] args) {
        System.out.println(count++);
        try {
            main(null);
        }
        catch (StackOverflowError n){
            System.out.println(n);
        }
    }
}
