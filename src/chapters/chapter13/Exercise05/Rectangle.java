package chapters.chapter13.Exercise05;

public class Rectangle extends GeometricObject {
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
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
