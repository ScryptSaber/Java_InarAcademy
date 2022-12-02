package chapters.chapter13.Exercise11;

public class Exercise13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon("purple", true, 5);
        System.out.println(o1);

        System.out.println("\nCloning the Octagon...");
        Octagon o2 = (Octagon) o1.clone();

        int result = (o1.compareTo(o2));
        if (result == 1) {
            System.out.println("Octagon is greather than its clone.");
        } else if (result == -1) {
            System.out.println("Octagon is less than its clone.");
        } else {
            System.out.println("Octagon is equal to its clone.");
        }

    }
}
