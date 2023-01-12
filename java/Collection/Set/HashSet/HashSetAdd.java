package Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetAdd {
//    Methods in java
    public static void main(String[] args) {

        HashSet obj = new HashSet();

//        Adding Methods
//        1) add(value)
        obj.add(120);
        obj.add("Hey");

        HashSet obj1 = new HashSet();
        obj1.add("Prince");
        obj1.add('H');
//        2) add(object_reference_variable) It will add the whole object in that object.
        obj.add(obj1);
        System.out.println(obj);

        HashSet obj2 = new HashSet<>();
        obj1.add("Mango");
        obj1.add(true);
//        3) addAll(object_reference_variable) It will add each object in that object.
        obj2.addAll(obj1);
        System.out.println(obj2);

        HashSet obj3 = new HashSet();
        obj3.add("Banana");
        obj3.add(false);
        HashSet obj4 = new HashSet<>();
        obj4.add("Apple");
        obj4.add('a');

    }
}
