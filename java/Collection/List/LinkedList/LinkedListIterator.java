package Collection.List.LinkedList;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIterator {
    public static void main(String[] args) {
//        Iterable loops in java collection

        LinkedList obj1 = new LinkedList();
        obj1.add("Apple");
        obj1.add(15);
        obj1.add(true);
        obj1.add('h');

//        Using a for loop:
        for (int i=0; i<obj1.size();i++){
            System.out.print(obj1.get(i) + " ");
        }
        System.out.println();

//        Homogeneous type
        LinkedList<Integer> obj2 = new LinkedList<Integer>();
        obj2.add(10);
        obj2.add(Integer.valueOf("20"));
        obj2.add(30);
        obj2.add(40);
        obj2.add(50);

//        Using an enhanced for loop:
        for (Integer i: obj2) {
            System.out.print(i + " ");
        }
        System.out.println();

        LinkedList<Integer> obj3 = new LinkedList<Integer>();
        obj3.add(10);
        obj3.add(20);
        obj3.add(30);

//        Using an iterator:
        Iterator<Integer> items = obj3.iterator();
        while (items.hasNext()){
            System.out.println(items.next());
        }

//      Using a forEach() method (Java 8 and later):
        obj3.forEach(var -> System.out.println(var));

        List<String> fruits = Arrays.asList("apple", "orange", "banana");
        fruits.forEach(fruit -> System.out.println(fruit));


    }
}
