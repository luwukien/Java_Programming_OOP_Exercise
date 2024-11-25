import data.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Circle c2 = new Circle(2.2);


        System.out.println(c2.toString());
        System.out.println(c1.toString());

        System.out.printf("Circumference of c1 is : %.2f \n", c1.getCircumference());
        System.out.printf("Circumference of c2 is : %.2f ", c2.getCircumference());
    }
}