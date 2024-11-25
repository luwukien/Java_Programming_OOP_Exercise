import data.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(4.5f, 6.55f);

        System.out.println("The area of this rectangle 1 is " + r1.getArea());
        System.out.println("The area of this rectangle 2 is " + r2.getArea());

        System.out.println("The perimeter of this rectangle 1 is " + r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        r1.setLength(6.6f);
        r1.setLength(4.4f);
        System.out.println(r1.toString());
    }
}