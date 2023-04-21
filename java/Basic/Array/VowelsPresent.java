package Array;

public class VowelsPresent {
    public static void main(String[] args) {
        char arr[] = {'H','A','R','E','E','S','H'};
        int count=0;
        for (char i = 0; i< arr.length; i++){
            if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I'|| arr[i] == 'O'|| arr[i] == 'U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
