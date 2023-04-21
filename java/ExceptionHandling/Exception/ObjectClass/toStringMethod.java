package ExceptionHandling.Exception.ObjectClass;

public class toStringMethod {
    public static void main(String[] args) {
                Object obj = new Object();
                System.out.println(obj);
                try {
                    String str = obj.toString();
                } catch (Exception e) {
                    System.out.println("An exception occurred: " + e.getMessage());
                }
    }
}
