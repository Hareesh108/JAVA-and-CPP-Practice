package String.String;

public class MethodsNewKeyword {
    public static void main(String[] args) {
        String obj = new String("Hello Harry");

        System.out.println(obj);
        System.out.println(obj.indexOf('a'));
        System.out.println(obj.length());
        System.out.println(obj.toLowerCase());
        System.out.println(obj.toUpperCase());
        System.out.println(obj.substring(2));
        System.out.println(obj.substring(6,11));
        System.out.println(obj.getBytes());

        System.out.println(obj.charAt(3));
        System.out.println(obj.isEmpty());
        System.out.println(obj.getClass());
        System.out.println(obj.trim());// beginning and ending space remove

        System.out.println(obj.replace('e','a'));

        System.out.println(obj.hashCode());
        System.out.println(obj.contains("Harry"));

        System.out.println(obj.intern());

        String obj1 = new String("Harry");

        System.out.println(obj1.startsWith("H"));
        System.out.println(obj1.endsWith("h"));

        System.out.println(obj.concat(" "+ obj1));

        System.out.println(obj);
        System.out.println(obj.lastIndexOf(obj1));

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = new String("Harry");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.equals(s3));

    }
}
