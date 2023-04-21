package String.StringBuilder;

public class Methods {
    public static void main(String[] args) {

        StringBuilder obj = new StringBuilder("Hello Harry");

        System.out.println(obj);
        System.out.println(obj.length());
        System.out.println(obj.substring(2));
        System.out.println(obj.substring(6,11));
        System.out.println(obj.charAt(3));
        System.out.println(obj.isEmpty());
        System.out.println(obj.getClass());


        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Hello");
        StringBuilder s3 = new StringBuilder("Harry");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.equals(s3));

    }
}
