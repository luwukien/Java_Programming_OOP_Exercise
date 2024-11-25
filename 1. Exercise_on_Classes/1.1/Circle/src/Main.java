import data.Circle;

public class Main {
    public static void main(String[] args) {
        //test class circle

        Circle c1 = new Circle();
        System.out.println("The area of the circle with radius " + c1.getRadius() + " is " + c1.getArea());

        Circle c2 = new Circle(2.0, "Red");
        System.out.println("The area of the circle with radius " + c2.getRadius() + " and the color: " + c2.getColor() + " is " + c2.getArea());

        System.out.println(c2.toString());

    }

}