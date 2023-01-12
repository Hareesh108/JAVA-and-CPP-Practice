package Collection.Set.TreeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetLoops {
    public static void main(String[] args) {
//        Iterable loops in java collection

        TreeSet obj = new TreeSet();

        obj.add(120);
        obj.add(55);
        obj.add(58);
        obj.add(26);
        obj.add(80);
        for (Object var: obj) {
            System.out.print(var + " ");
        }
        System.out.println();

//        Homogeneous type
        TreeSet<Integer> obj2 = new TreeSet<>();
        obj2.add(10);
        obj2.add(20);
        obj2.add(30);

//        Using an enhanced for loop:
        for (Integer var: obj2) {
            System.out.print(var + " ");
        }
        System.out.println();

//        Using an iterator:
        Iterator<Integer> items = obj2.iterator();
        System.out.println(items);
        while (items.hasNext()){
            System.out.println(items.next());
        }

//        Using a forEach() method (Java 8 and later):
        obj2.forEach(var -> System.out.println(var));


    }
}
