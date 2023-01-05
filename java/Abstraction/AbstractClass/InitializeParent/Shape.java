package Abstraction.AbstractClass.InitializeParent;

public abstract class Shape {
    double S_height;
    double S_width;
    Shape(double height,double width)
    {
        this.S_height = height;
        this.S_width = width;
    }
    abstract public void area();
}
