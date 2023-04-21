package NonStatic;

public class H1 {

    String Myname;

    {
//        H1 obj = new H1("harry");
//        System.out.println(obj.Myname);
        System.out.println("Hello");
    }

    H1(String name){
        this.Myname = name;
    }

    public static void main(String[] args) {
        H1 obj = new H1("Harry");
        System.out.println(obj.Myname);
        System.out.println(obj);
    }


}
