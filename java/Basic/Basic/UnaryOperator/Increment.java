package Basic.UnaryOperator;

public class Increment {
    public static void main(String[] args) {
        int a = 2;
        int b = a++;
        int c = ++b;

        int sum = a + b + c + ++b + c++ + ++a + b;
        System.out.println(sum);
    }
}
