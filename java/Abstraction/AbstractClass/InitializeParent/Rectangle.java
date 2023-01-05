package Abstraction.AbstractClass.InitializeParent;

public class Rectangle extends Shape{

    Rectangle(){
        super(20,10);
    }
    public void area(){
        double result = super.S_height * super.S_width;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
