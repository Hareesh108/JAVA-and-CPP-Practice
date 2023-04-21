package String;

public class DuplicateReturn {
    public static void main(String[] args) {
        String s = "my name is hareesh bhittam";

        for (char ch = 'a'; ch<='z'; ch++)
        {
            int i, count = 0;
            for ( i =0; i<s.length();i++) {
                if(ch == s.charAt(i) ) {
                    count++;
                }
            }
            if(count > 1)
                System.out.println(ch);
        }
    }
}
