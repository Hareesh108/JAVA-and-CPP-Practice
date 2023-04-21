package NonStatic;

public class N1 {
    int n;
    int a = 10;

    N1(){
        System.out.println("Hello,");
    }

    N1(int n){
        this.n = n;

//        N1 obj2 = new N1(50);
        System.out.println(a);
        System.out.println(n);

//        void add(){
//            System.out.println("Add method");
//        }
    }

    public static void main(String[] args) {
        N1 obj = new N1(100);
//        System.out.println(obj.n);
        obj.n = 200;
//        System.out.println(obj.n);
//        N2 obj1 = new N2();
//        System.out.println(obj1.b);
//        System.out.println(N2.b);
//        System.out.println(obj1.c);
//        System.out.println(obj1.add(10));

        N2 obj1 = new N2(1000);
        System.out.println(obj1.b);
        System.out.println(obj1.c);
    }
}
