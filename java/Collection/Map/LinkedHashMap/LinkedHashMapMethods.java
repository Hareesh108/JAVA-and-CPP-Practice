package Collection.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class LinkedHashMapMethods {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(5,"Lemon");
        map1.put(6,"Cherry");

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

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
