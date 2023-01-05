package Abstraction.AbstractClass.Inheritance.Hierarchical;

public class Rectangle extends Shape{

    double height;
    double width;
    public void getArea(){
        double result = height * width;
        System.out.println("Area of Rectangle: "+result);
    }
    Rectangle(double height,double width)
    {
        this.height = height;
        this.width = width;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20,10);
        r.getArea();
    }
}
