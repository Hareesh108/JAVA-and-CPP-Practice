package InnerClasses.Anonymous;

public abstract class Abstract1 {

    Abstract1(int n){
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        Abstract1 a = new Abstract1(20) {
        };

        System.out.println(a);
    }
}
