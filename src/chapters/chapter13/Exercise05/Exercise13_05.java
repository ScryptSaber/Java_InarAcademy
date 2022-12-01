package chapters.chapter13.Exercise05;

public class Exercise13_05 {
    public static void main(String[] args) {
        Circle c1 = new Circle("green", false, 5);
        Circle c2 = new Circle("white", true, 3);
        System.out.println("\nThe larger of the two circles is :\n" + (Circle.max(c1, c2)));


        Rectangle r1 = new Rectangle("green", true, 12, 15);
        Rectangle r2 = new Rectangle("orange", false, 7, 17);
        System.out.println("\nThe larger of the two rectangles is :\n" + (Rectangle.max(r1, r2)));
    }
}
