package chapters.chapter10.Exercise13;

public class Exercise10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Rectangle:");
        System.out.println("-----------------------");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println((r1.contains(3, 3) ? "contains" : "does not contain") + " the point (3, 3).");

        System.out.println((r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "contains" :
                "does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");

        System.out.println((r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "overlaps" :
                "does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");
    }
}
