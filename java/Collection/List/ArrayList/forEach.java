package Collection.List.ArrayList;

import java.util.*;

public class forEach {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        System.out.println(words);

        for (Object word : words) {
            System.out.println(word.toString());
        }

        for (String word : words) {
            System.out.println(word.toString());
        }

        ArrayList obj = new ArrayList();
        obj.add("harry");
        obj.add(24);
        obj.add('a');

        for (Object o : obj) {
            System.out.println(o.toString());
        }


        AbstractList var1 = obj;
        System.out.println(var1);

        Object var2 = obj;
        System.out.println(var2);

        AbstractCollection var3 = obj;
        System.out.println(var3);

        List<String> colors = Arrays.asList("red", "blue", "green");
        for (String color : colors) {
            System.out.println(color);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        ArrayList<Integer> obj2 = new ArrayList<Integer>();
        obj2.add(10);
        obj2.add(Integer.valueOf("20"));
        obj2.add(30);
        obj2.add(40);
        obj2.add(50);

        for (Integer var: obj2) {
            System.out.print(var.toString() + " ");
        }
    }
}
