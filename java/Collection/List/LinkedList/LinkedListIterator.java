package Collection.List.LinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
    public static void main(String[] args) {
//        Iterable loops in java collection

        LinkedList obj1 = new LinkedList();
        System.out.println(obj1);

        obj1.add("Apple");
        obj1.add(15);
        obj1.add(true);
        obj1.add('h');

        System.out.println(obj1);

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

        for (Integer i: obj2) {
            System.out.print(i + " ");
        }
        System.out.println();

        LinkedList<Integer> obj3 = new LinkedList<Integer>();
        obj3.add(10);
        obj3.add(20);
        obj3.add(30);
        Iterator<Integer> items = obj3.iterator();
        while (items.hasNext()){
            System.out.println(items.next());
        }


    }
}
