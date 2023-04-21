package BasicPrograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " " +b);

        int x = 50;
        int y = 100;
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }
}
