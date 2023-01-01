package Inheritance.Hierarchical;

public class Mechanical extends Collage{

    public void DeptName(){
        System.out.println("My Mechanical Department");
    }

    public static void main(String[] args) {
        Mechanical obj = new Mechanical();
        obj.Name();
        obj.DeptName();
    }
}
