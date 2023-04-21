package LoopsPrograms;

public class Count {
    public static void main(String[] args) {
        // The total count of vowels from a to z
        int count = 0;
        int ch = 'a';
        while (ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            ch++;
        }
        System.out.println("The total count of vowels from a to z : "+ count);

        //count the divisible by 5 and 7 between 0 to 200.

        int m = 0;
        int cn = 0;
        while(m <= 200){
            if(m % 5 == 0 && m % 7 == 0 ) {
                cn++;
            }
            m++;
        }
        System.out.println("count the divisible by 5 and 7 between 0 to 200 : " + cn );
    }
}
