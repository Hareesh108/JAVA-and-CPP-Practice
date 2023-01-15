package Collection.Combination;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(30);
        numbers.add(22);
        numbers.add(30);
        numbers.add(30);

        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        System.out.println(numbersArray.length);

        for (int i = 0; i <numbersArray.length ; i++) {
            System.out.println(numbersArray[i]);
        }

        Integer[] numbersArray1 = new Integer[numbers.size()];
        numbersArray1 = numbers.toArray(numbersArray1);

        System.out.println(numbersArray1.length);
        for (int i = 0; i <numbersArray1.length ; i++) {
            System.out.println(numbersArray1[i]);
        }


    }
}
