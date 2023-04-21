package String.StringBuilder;

public class IMPMethods {
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder("Hareesh");
        obj.append(" Bhittam");
        obj.append(2);
        obj.append('a');
        obj.append(20.22);
        obj.append(true);

        System.out.println(obj);
        System.out.println(obj.capacity());




        obj.delete(5,10);
        obj.deleteCharAt(1);
        System.out.println(obj);

        obj.insert(2,"Harry");
        obj.insert(3,20.50);
        obj.insert(8,true);
        obj.insert(5,'g');
        System.out.println(obj);

        System.out.println(obj);
        System.out.println(obj.length());
        System.out.println(obj.substring(2));
        System.out.println(obj.substring(6,11));
        System.out.println(obj.charAt(11));
        System.out.println(obj.isEmpty());
        System.out.println(obj.getClass());

        StringBuilder obj1 = new StringBuilder("Prince");
        obj.append(obj1);
        System.out.println(obj);

    }
}
