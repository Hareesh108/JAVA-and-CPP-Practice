package Collection.Combination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ReverseHashSet {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(22);
        h.add(40);
        h.add(30);
        h.add(10);
        System.out.println(h);
        ArrayList obj4 = new ArrayList(h);
        System.out.println(obj4);

        Collections.sort(obj4);
        System.out.println(obj4);

        Collections.reverse(obj4);
        System.out.println(obj4);
    }
}
