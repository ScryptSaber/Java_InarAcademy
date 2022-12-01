package chapters.chapter13.Exercise07;

import chapters.chapter13.Exercise05.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {

    }

    public Square(String color, boolean filled, double side) {
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
    public void howToColor() {
        System.out.println("Color all four sides..");
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + this.side;
    }
}
