package Collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayListAdd {
//    Methods in java
    public static void main(String[] args) {

        ArrayList obj = new ArrayList();

//        Adding Methods
//        1) add(value)
        obj.add(120);
        obj.add("Hey");
//        2) add(index,value)
        obj.add(2,true);
        obj.add(0,25.56);

        ArrayList obj1 = new ArrayList();
        obj1.add("Prince");
        obj1.add('H');
//        3) add(object_reference_variable) It will add the whole object in that object.
        obj.add(obj1);
        System.out.println(obj);

        ArrayList obj2 = new ArrayList();
        obj1.add("Mango");
        obj1.add(true);
//        4) addAll(object_reference_variable) It will add each object in that object.
        obj2.addAll(obj1);
        System.out.println(obj2);

        ArrayList obj3 = new ArrayList();
        obj3.add("Banana");
        obj3.add(false);
        ArrayList obj4 = new ArrayList();
        obj4.add("Apple");
        obj4.add('a');
//        4) addAll(start_index,object_reference_variable) It will add each object in that object.
        obj3.addAll(1,obj4);
        System.out.println(obj3);

    }
}
