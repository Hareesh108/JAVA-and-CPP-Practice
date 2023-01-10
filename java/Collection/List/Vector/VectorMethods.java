package Collection.List.Vector;

import java.util.Vector;

public class VectorMethods {


    public static void main(String[] args) {
        Vector obj = new Vector();

        System.out.println(obj);
        System.out.println(obj.isEmpty());

        obj.add(120);
        obj.add("Hey");
        obj.add(true);
        obj.add(25.56);
        obj.add('a');
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());

        System.out.println(obj.size());
        System.out.println(obj.contains(true));

        System.out.println(obj.indexOf('a'));

        System.out.println(obj.get(2));

        System.out.println(obj.set(2,"banana"));
        System.out.println(obj);

    }
}
