package Collection.List.LinkedList;

import java.util.LinkedList;

public class ExtraMethods {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.add(120);
        obj.add("Hey");
        obj.add(true);
        obj.add(25.56);
        obj.add('a');
        obj.add(false);
        System.out.println(obj);

//        IMP Methods
        obj.addFirst(25);
        obj.addLast("mango");
        obj.removeFirst();
        obj.removeLast();
        obj.removeFirstOccurrence(true);
        obj.removeLastOccurrence('a');
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        System.out.println(obj);
    }
}
