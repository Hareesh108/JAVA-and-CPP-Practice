package Collection.List.LinkedList;

import java.util.LinkedList;

public class LinkedListMethods {
//    Methods in java

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        obj.add(120);
        obj.add("Hey");
        obj.add(true);
        obj.add(25.56);
        obj.add('a');

        System.out.println(obj.size());
        System.out.println(obj.contains(true));
        System.out.println(obj.indexOf('a'));
        System.out.println(obj.get(2));
        System.out.println(obj.set(2,"banana"));
        System.out.println(obj);
    }
}
