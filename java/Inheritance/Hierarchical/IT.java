package Inheritance.Hierarchical;

public class IT extends Collage{
    public void DeptName(){
        System.out.println("My IT Department");
    }

    public static void main(String[] args) {
        IT obj = new IT();
        obj.Name();
        obj.DeptName();
    }
}
