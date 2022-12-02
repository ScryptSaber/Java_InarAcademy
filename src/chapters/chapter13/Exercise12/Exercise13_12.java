package chapters.chapter13.Exercise12;

public class Exercise13_12 {
    public static void main(String[] args) {
        GeometricObject[] geoObjects = {new Circle("blue", true, 12),
                new Circle("white", false, 15),
                new Rectangle("green", true, 32, 12),
                new Rectangle("black", false, 23, 19)};

        System.out.printf("Total area of Geometric Objects: %.2f", sumArea(geoObjects));

    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
