package BasicPrograms;

public class NestedCondition {
    public static void main(String[] args) {
        char ch = 'g';
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
    }
}
