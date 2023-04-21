package Array;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,1,2,3,5,1,4,5,7};

        int newArr[] = new int[arr.length];

        int visited = -1;

        for (int i=0; i< arr.length;i++){
            int count = 1;
            for (int j=i+1; j< arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    newArr[j] = visited;
                }
                if(newArr[i] != visited){
                    newArr[i] = count;
                }
            }
        }
        for (int i=0; i< newArr.length;i++){
            if(newArr[i] != visited){
                System.out.println("Frequency of "+ arr[i] + " = " + newArr[i]);
            }
        }
    }
}
