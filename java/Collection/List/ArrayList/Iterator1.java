package Collection.List.ArrayList;

import Abstraction.Interface.MultipleInheritance.AwesomeCar.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        Iterator<String> itr = words.iterator();
        while(itr.hasNext()){
            String var = itr.next();
            System.out.println(var);
        }

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
