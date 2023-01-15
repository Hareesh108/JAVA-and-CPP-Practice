package ExceptionHandling.Error;

public class StackOverFlow {
    static int count = 1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(null);
    }
}
