package ExceptionHandling.tryCatch;

public class NoWorkingDownCasting {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = null;
        try {
            System.out.println(arr.length);
        }
        catch (Exception n){
            System.out.println(n);
        }
        try {
            int res = a/b;
        }
        catch (Exception n){
            System.out.println(n);
        }
//        java: exception java.lang.ArithmeticException has already been caught
////        Exception 'java.lang.NullPointerException' has already been caught
////        We cant define
//        catch (Exception mm){
//            System.out.println(mm);
//        }
//        catch (ArithmeticException mm){
//            System.out.println(mm);
//        }
//        catch (NullPointerException mm){
//            System.out.println(mm);
//        }
    }
}
