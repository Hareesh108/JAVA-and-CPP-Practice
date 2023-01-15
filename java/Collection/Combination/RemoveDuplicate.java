package Collection.Combination;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //        Remove Duplicate from ArrayList
        ArrayList obj = new ArrayList();

        obj.add(25);
        obj.add(88);
        obj.add(true);
        obj.add(25);
        obj.add("hey");
        obj.add(true);
        System.out.println(obj);

        HashSet obj1 = new HashSet(obj);
        System.out.println(obj1);
    }
}
