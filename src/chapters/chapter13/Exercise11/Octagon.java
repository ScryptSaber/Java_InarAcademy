package chapters.chapter13.Exercise11;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    private double side;

    public Octagon() {

    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Octagon octa = (Octagon) super.clone();
        return octa;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public double getArea() {
        double area = (2 + 4 / Math.sqrt(2)) * side * side;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }

}
