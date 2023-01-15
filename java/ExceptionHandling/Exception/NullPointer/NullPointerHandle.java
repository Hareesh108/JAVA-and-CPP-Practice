package ExceptionHandling.Exception.NullPointer;

public class NullPointerHandle {
    public static void main(String[] args) {
        int[] a = null;

        try{
            System.out.println(a.length);
        }
        catch (NullPointerException n){
            System.out.println(n);
        }

        System.out.println("Worked");
    }
}
