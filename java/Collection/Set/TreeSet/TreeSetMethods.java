package Collection.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetMethods {
//    Methods in java

    public static void main(String[] args) {
        TreeSet obj = new TreeSet();

        System.out.println(obj);
        System.out.println(obj.isEmpty());

//      1) add(value) Homogeneous
        obj.add(120);
        obj.add(120);
        obj.add(55);
        obj.add(58);
        obj.add(26);
        obj.add(80);
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.size());
        System.out.println(obj.contains(58));
        System.out.println(obj);

//        1) remove(value)
        obj.remove(25);
        System.out.println(obj);

    }
}
