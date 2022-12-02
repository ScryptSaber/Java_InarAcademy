package chapters.chapter13.Exercise09;


public class Circle extends GeometricObject implements Comparable<GeometricObject> {
    private double radius;

    public Circle() {

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Circle) o) == 0;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) {
            return 1;
        } else if (this.radius < o.radius) {
            return -1;

        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
