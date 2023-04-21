package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("ABC",123);
        map.put("DEF",458);
        map.put("ABC",123);
        map.put("aaa",458);
        System.out.println(map.size());
    }
}
