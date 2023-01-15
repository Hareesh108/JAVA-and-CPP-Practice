package Abstraction.Interface.Combine;

public class Student implements Medical, Engineering {

    public void study(){
        System.out.println("Studying");
    }

    public void admission(){
        System.out.println("Taken Admission");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.admission();
        s.study();
    }

}
