package data;

public class Circle {

    private double radius;
    private String color;


    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}


