package Collection.Combination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class reverseTreeSet {
    public static void main(String[] args) {
        TreeSet h = new TreeSet();
        h.add(22);
        h.add(40);
        h.add(30);
        h.add(10);
        System.out.println(h);
        ArrayList obj4 = new ArrayList(h);

        Collections.reverse(obj4);
        System.out.println(obj4);
    }
}
