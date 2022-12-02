package chapters.chapter13.Exercise10;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }


    @Override
    public double getArea() {
        return height * width;
    }
    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Rectangle)o) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
