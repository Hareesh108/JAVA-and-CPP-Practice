package Abstraction.Interface.Hybrid.Complex;

public class Student implements Medical, Engineering {

    public void study(){
        System.out.println("Studying");
    }

    public void admission(){
        System.out.println("Taken Admission");
    }

    public void firstCollage(){
        System.out.println("IIT");
    }

    public void secondCollage(){
        System.out.println("NIT");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.admission();
        s.study();
        s.firstCollage();
        s.secondCollage();
    }

}
