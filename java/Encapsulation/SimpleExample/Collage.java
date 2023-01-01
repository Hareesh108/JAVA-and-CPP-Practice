package Encapsulation.SimpleExample;

public class Collage {
    static String Coll_Name = "Java Collage";

    public static void main(String[] args) {
        Student S1 = new Student("Harry","20/10/2000",25000);

        System.out.println(S1);
        S1.get_details();

        System.out.println(S1.getSt_fee());

        S1.setSt_fee(50000);
        System.out.println(S1.getSt_fee());
    }
}
