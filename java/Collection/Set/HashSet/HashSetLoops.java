package Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetLoops {
    public static void main(String[] args) {
//        Iterable loops in java collection

        HashSet obj1 = new HashSet();
        System.out.println(obj1);

        obj1.add("Apple");
        obj1.add(15);
        obj1.add(true);
        obj1.add('h');
        for (Object var: obj1) {
            System.out.print(var + " ");
        }
        System.out.println();

//        Homogeneous type
        HashSet<Integer> obj2 = new HashSet<>();
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
