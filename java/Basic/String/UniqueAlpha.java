package String;

import java.util.Scanner;

public class UniqueAlpha {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();

        String s = "my name is hareesh bhittam";

        for (char ch = 'a'; ch<='z'; ch++)
        {
            int i, count = 0;
            for ( i =0; i<s.length();i++) {
                if(ch == s.charAt(i) ) {
                    count++;
                }
            }
            if(count == 1)
                System.out.println(ch);
        }
    }
}

