package ObjectClass.toString;

public class Collage extends Object{

    int C_id;

    Collage(int id){
        C_id = id;
    }

    public String toString(){
        return "SU@" + C_id;
    }

    public static void main(String[] args) {
        Collage c1 = new Collage(1);
        System.out.println(c1);
        Collage c2 = new Collage(2);
        System.out.println(c2);
        Collage c3 = new Collage(3);
        System.out.println(c3);
    }
}
