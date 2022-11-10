package chapters.chapter10.Exercise12;

import chapters.chapter10.Exercise04.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this(0, 0, 1, 1, 2, 5);
    }

    public Triangle2D(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        this(new MyPoint(p1x, p1y), new MyPoint(p2x, p2y), new MyPoint(p3x, p3y));
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        double s = (side1 + side2 + side3) / 3;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }

    public double getPerimeter() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        return side1 + side2 + side3;
    }

}
