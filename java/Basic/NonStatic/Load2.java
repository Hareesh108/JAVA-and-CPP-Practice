package NonStatic;

public class Load2 {

    Load2(){
        Load2 obj = new Load2();
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Load2 obj = new Load2();
    }
}
