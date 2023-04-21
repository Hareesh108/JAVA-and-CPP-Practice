package BasicPrograms;

public class ReturnStringAns {

    public static String add(int a, int b)
    {
        String res = "";
        int sum = 0;
        while(a <= b) {
            if (a % 3 == 0 && a % 7 == 0) {
                sum = sum + a;
            }

            a++;
        }
        res = res + sum;

        return res;

    }

    public static void main(String[] args) {

        System.out.println(add(1,100));

    }
}
