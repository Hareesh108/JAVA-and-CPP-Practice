package Collection.Combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TraverseHashSetWithIndex {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(22);
        h.add(40);
        h.add(30);
        h.add(10);
        System.out.println(h);
        ArrayList obj4 = new ArrayList(h);

        for (int i=0; i<obj4.size();i++){
            System.out.println(obj4.get(i));
        }
    }
}
