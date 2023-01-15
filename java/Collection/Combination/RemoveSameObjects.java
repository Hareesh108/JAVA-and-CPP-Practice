package Collection.Combination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RemoveSameObjects {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();

        obj.add(25);
        obj.add(88);
        obj.add(true);
        obj.add(25);
        obj.add("hey");
        obj.add(true);
        System.out.println(obj);

        obj.removeIf(i -> Collections.frequency(obj, i) > 1);
        System.out.println(obj);
    }
}
