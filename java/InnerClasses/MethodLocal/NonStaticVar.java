package InnerClasses.MethodLocal;

public class NonStaticVar {
    int k = 220;
    static int j = 320;

    public void demo(){
        final int h = 100;

        int d = 55;
        class Local{
            public void sum(){
                System.out.println(d);
                System.out.println(h);
                System.out.println(k);
                System.out.println(NonStaticVar.this.k);
                System.out.println(j);
                System.out.println(NonStaticVar.j);
            }
        }
        Local l = new Local();
        l.sum();
        l.sum();
    }

    public static void main(String[] args) {
        NonStaticVar o = new NonStaticVar();
        o.demo();
    }
}
