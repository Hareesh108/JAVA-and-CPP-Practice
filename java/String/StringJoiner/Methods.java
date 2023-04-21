package String.StringJoiner;

import java.util.StringJoiner;

public class Methods {
    public static void main(String[] args) {

        StringJoiner obj = new StringJoiner("Hii");

        StringJoiner sj23 = new StringJoiner(",");

        StringJoiner sj = new StringJoiner("-", "[", "]");

        sj.add("apple");
        int length = sj.length();
        System.out.println(sj.toString());
        StringJoiner sj1 = new StringJoiner("-");
        sj1.add("apple");
        sj1.add("banana");
        sj1.merge(sj);

        System.out.println(sj);
        System.out.println(sj1);

        sj.setEmptyValue("None");

    }
}
