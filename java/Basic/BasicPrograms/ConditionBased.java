package BasicPrograms;

public class ConditionBased {
    public static void main(String[] args) {
        int num = 10;
        if(num % 2 == 0 && num % 5 == 0){
            System.out.println("Hii");
        }
        else if (num % 7 != 0 || num % 3 != 0){
            System.out.println("Bye");
        }
        else if (num % 2 != 0 && num % 9 == 0){
            System.out.println("Good Bye");
        }
        else {
            System.out.println("Block");
        }
    }
}
