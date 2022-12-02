package chapters.chapter13.Exercise09;

public class Exercise13_09 {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", true, 5);
        Circle c2 = new Circle("green", false, 6);
        Circle c3 = new Circle("green", false, 5);

        System.out.println("Circle1 radius: " + c1.getRadius());
        System.out.println("Circle2 radius: " + c2.getRadius());
        System.out.println("Circle3 radius: " + c3.getRadius());

        System.out.println("Circle1 is " + (c1.equals(c2) ? "" : "not ") + "equal to circle2");
        System.out.println("Circle1 is " + (c1.equals(c3) ? "" : "not ") + "equal to circle3");
    }
}
