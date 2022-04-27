
// import p1.*;
import p2.*;
import p3.*;

class Cone implements ThreeDShape {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double volume() {
        double v;
        v = (3.14 * radius * radius) * (height / 3);
        return v;
    }

    public void describe() {
        System.out.println("Volume : " + volume());
    }
}

class Rectangle implements TwoDShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        double v;
        v = width * height;
        return v;
    }

    public double perimeter() {
        double p;
        p = 2 * (width + height);
        return p;
    }

    public void describe() {
        System.out.println("Area : " + area() + " , Perimeter : " + perimeter());
    }
}

class Sphere implements ThreeDShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        double v;
        v = (4 / 3) * 3.14 * radius * radius * radius;
        return v;
    }

    public void describe() {
        System.out.println("Volume : " + volume());
    }
}

public class program3 {
    public static void main(String[] args) {
        Cone c = new Cone(1.2, 0.3);
        c.describe();
    }
}
