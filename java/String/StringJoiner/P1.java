package String.StringJoiner;

import java.util.StringJoiner;

public class P1 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Mango");
        String joinedString = joiner.toString();
        System.out.println(joinedString);

        StringJoiner joiner1 = new StringJoiner(",", "[", "]");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Mango");
        String joinedString1 = joiner1.toString();
        System.out.println(joinedString1);


    }
}
