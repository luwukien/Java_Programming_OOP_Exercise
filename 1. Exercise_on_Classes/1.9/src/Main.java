import data.Ball;

public class Main {
    public static void main(String[] args) {
        Ball ballTest01 = new Ball(5.54f, 4.2354f, 6, 3.6368F,4.4545F);

        //test getter & setter
//        System.out.println(ballTest01.getRadius());
//        System.out.println(ballTest01.getyDelta());
//        System.out.println(ballTest01.getxDelta());
//        ballTest01.setX(5.6F);
        ballTest01.setX(80.0F);
        ballTest01.setY(35.5F);
        ballTest01.setRadius(5);
        ballTest01.setxDelta(4.0F);
        ballTest01.setyDelta(6.0F);
        System.out.println(ballTest01);

        //move
        ballTest01.move();
        System.out.println(ballTest01);
        System.out.println(ballTest01);
//        //reflect
//        ballTest01.reflectHorizontal();
//        System.out.println(ballTest01);

        //Bounce the ball within the boundary
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;

        for (int i = 0; i < 15; i++) {
            ballTest01.move();
            System.out.println(ballTest01);
            float xNew = ballTest01.getX();
            float yNew = ballTest01.getY();
            //check boundary value to bounce back
            if ((xNew + ballTest01.getRadius()) > xMax || (xNew - ballTest01.getRadius()) < xMax) {
                ballTest01.reflectHorizontal();
            }
            if ((yNew + ballTest01.getRadius()) > yMax || (yNew - ballTest01.getRadius() < yMax)) {
                ballTest01.reflectVertical();
            }

        }
    }
}