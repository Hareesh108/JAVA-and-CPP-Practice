package Abstraction.AbstractClass.Inheritance.Hierarchical;

import static java.lang.Math.PI;

public class Circle extends Shape {
    double redius;
    public void getArea(){
        double result = 2*PI*redius;
        System.out.println("Area of Circle: "+result);
    }
    Circle(double redius)
    {
        this.redius = redius;
    }
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.getArea();
    }
}
