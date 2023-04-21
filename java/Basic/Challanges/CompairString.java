package Challanges;

public class CompairString {

    public static void main(String[] args) {

        String s1 = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";

        String s2 = "is";
//        int size1 = s2.length();
//        char z[] = s2.toCharArray();

        String result = "";

        char y[] = s1.toCharArray();
        int size = s1.length();
//        int i = 0;
//        while(i != size || j != size1){
//            if(y[i] != z[i]){
//                result = result + y[i];
//            }
//            i++;
//        }
//
//        System.out.println(result);

        int i = 0;
        while (i != size)
        {
            for (char j = 0; j<s2.length();j++){
                if(i != j){
                    i++;
                    result = result + y[i];
                    break;
                }
                if(j == i ){
                    i++;
                    j++;
                }

            }

        }
        System.out.println(result);
//        System.out.println("result" + 'a');
    }

}
