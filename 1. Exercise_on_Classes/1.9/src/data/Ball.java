package data;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    //getter

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getyDelta() {
        return yDelta;
    }

    public float getxDelta() {
        return xDelta;
    }

    //setter

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    //move one step
    public void move() {

        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = - xDelta;
    }
    public void reflectVertical() {
        yDelta = - yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" +
                "x=" + x +
                ", y=" + y + ") " + "(speed = "
                + xDelta +
                ", " + yDelta +
                ")]";
    }
}
