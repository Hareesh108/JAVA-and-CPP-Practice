package Inheritance.Hierarchical;

public class Civil extends Collage{
    public void DeptName(){
        System.out.println("My Civil Department");
    }

    public static void main(String[] args) {
        Civil obj = new Civil();
        obj.Name();
        obj.DeptName();


    }
}
