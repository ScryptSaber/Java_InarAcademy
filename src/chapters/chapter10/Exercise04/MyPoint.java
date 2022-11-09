package chapters.chapter10.Exercise04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);

    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}
