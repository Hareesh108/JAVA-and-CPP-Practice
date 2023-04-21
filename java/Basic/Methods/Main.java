package Methods;

public class Main {

    public static int test(int n){
        for (int i=1; i <n; i++){
            if(n % 2 == 0)
                return n;
        }
        return -1;
    }

    public static int test2(int a, int b){

        while(a !=b){
            if(a>b)
                a=a-b;
            else
                a = b-a;
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println(test(11));
        System.out.println(test2(4,17));
//        You cannot do this :
//        int n = add();
//        System.out.println(add());
    }
}
