package ObjectClass.toString;

public class Student {
    int S_id;

    Student(int id){
        S_id = id;
    }

    public String toString(){
        return "TKIET@" + S_id;
    }

    public static void main(String[] args) {
        Object c1 = new Student(1);
        System.out.println(c1.toString());
        Object c2 = new Student(2);
        System.out.println(c2);
        Object c3 = new Student(3);
        System.out.println(c3);
    }

}
