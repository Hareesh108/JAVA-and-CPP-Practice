package Challanges;

public class Search {
    public static void main(String[] args) {
        String[] arr = {"Cecilio Johnes","Cordell Acott","Curtice Bleue","Dalis Menary","Emanuele Barstock","Emmy Bradane","Gian Cossington","Jamaal Danilevich","Kerri Wilce","Liuka Cowern","Merrel Cornuau","Marena Appleton","Marlee Stobo","Rochette Brew","Rudyard Abbate","Sharona Climo","Shirlee Titcumb","Taite Joriot","Taite Huntriss","Zach Simchenko"};

        String s = "c";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == s){
                System.out.println(arr[i]);
            }
        }
    }
}
