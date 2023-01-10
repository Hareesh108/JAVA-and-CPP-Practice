package Collection.List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorRemove {
    public static void main(String[] args) {
        Vector obj = new Vector();

        obj.add(120);
        obj.add("Hey");
        obj.add(2,true);
        obj.add(3,25.56);

//        Remove Methods in ArrayList
//        1) remove(value) it will work non integer value
        obj.remove(25.56);
//        2) remove(index)
        obj.remove(1);
//        3) remove(Integer.valueOf()) used of if value is Integer
        obj.remove(Integer.valueOf(120));
        System.out.println(obj);

//        If we try to access or remove the object with greater than or equal the size of
//        Arraylist it will throw the Exception called "IndexOutOfBoundsException"
//        obj.get(10);
//        obj.remove(10);
    }
}
