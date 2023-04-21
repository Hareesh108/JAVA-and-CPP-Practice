package InnerClasses.MethodLocal;

public class Outer {
    public void demo(){
        class Local{
            public void sum(int n, int m){
                System.out.println(n+m);
            }
        }
        Local l = new Local();

        l.sum(10,20);
        l.sum(50,20);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.demo();
    }
}
