import java.awt.Color;

public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private Color color;
    private double area;

    // The default constructor with no argument.
    public Circle() {
        radius = 1.0;
        color = Color.red;
    }

    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for retrieving the area of circle
    public double getArea() {
        calculateArea();
        return area;
    }

    // A private method for computing the area of circle
    private void calculateArea(){
        area = radius*radius*Math.PI;
    }
}