package Collection.Combination;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        //        Sort ArrayList and Reverse
        AbstractList<Integer> a = new ArrayList();
        a.add(23);
        a.add(58);
        a.add(87);
        a.add(4);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
    }
}
