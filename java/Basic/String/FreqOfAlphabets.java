package String;

public class FreqOfAlphabets {
    public static void main(String[] args) {
        String s = "my name is hareesh bhittam";

        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            int count = 0;
            for (int i = 0; i < s.length(); i++){
                if(ch == s.charAt(i))
                {
                    count++;
                }
            }
            if (count != 0)
                System.out.println(ch + " frequency is " + count);

        }


    }
}
