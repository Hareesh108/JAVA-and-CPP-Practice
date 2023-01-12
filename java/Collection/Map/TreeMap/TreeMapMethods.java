package Collection.Map.TreeMap;

import java.util.HashMap;
import java.util.TreeMap;


public class TreeMapMethods {

    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(5,"Lemon");
        map1.put(6,"Cherry");

        TreeMap<Integer, String> map = new TreeMap<>();

// Adding key-value pairs
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Banana");
        map.put(4,"Kiwi");
        map.putAll(map1);
        System.out.println(map);

//        Replace
        map.put(4,"Orange");
        map.replace(4,"Kiwi");
        System.out.println(map);

//        Normal Methods
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Tom"));

// Retrieving a value, if key is not their then return default value
        String Value = map.get(2);
        System.out.println(Value);


// Removing a key-value pair
        map.remove(3);
        map.remove(4,"Kiwi");
        System.out.println(map);

    }
}
