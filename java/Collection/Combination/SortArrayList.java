package Collection.Combination;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
//        Sort ArrayList
        AbstractList a = new ArrayList();
        a.add(23);
        a.add(58);
        a.add(87);
        a.add(4);

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        AbstractList<String> a1 = new ArrayList();
        a1.add("23");
        a1.add("Hii");
        a1.add("87");
        a1.add("ab");

        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);

    }
}
