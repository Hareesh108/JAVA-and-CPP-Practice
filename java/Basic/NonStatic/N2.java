package NonStatic;

public class N2 {
    static int b = 20;
    int c = 30;

    N2(int b){
        this.b = b;
        this.c = b;
    }

    int add(int n){
        System.out.println("Add method");
        return n;
    }
}
