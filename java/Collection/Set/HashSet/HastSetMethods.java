package Collection.Set.HashSet;


import java.util.ArrayList;
import java.util.HashSet;

public class HastSetMethods {
//    Methods in java

    public static void main(String[] args) {
        HashSet obj = new HashSet(10);

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
        System.out.println(obj);

//        Remove Methods in ArrayList
//        1) remove(value) it will work non integer value
        obj.remove(25.56);
//        2) remove(Integer.valueOf()) used of if value is Integer
        obj.remove(120);
        System.out.println(obj);


    }
}
