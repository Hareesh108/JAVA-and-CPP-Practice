package Collection.Map.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Looping {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Banana");
        map.put(4,"Kiwi");

//        Using the keySet() method:
        for (Integer key: map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

//        Using the entrySet() method:
        for (Map.Entry<Integer,String> var: map.entrySet()){
            System.out.println(var.getKey());
            System.out.println(var.getValue());
        }

//        Using the forEach() method (Java 8 and later):
        map.forEach((key, value) -> System.out.println(key + ": " + value));

//        Using Iterator
        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        System.out.println(itr);
        while (itr.hasNext()){
            Map.Entry<Integer,String> var = itr.next();
//            System.out.println(itr.next());
            System.out.println(var.getKey() + ": "+ var.getValue());
        }

    }
}
