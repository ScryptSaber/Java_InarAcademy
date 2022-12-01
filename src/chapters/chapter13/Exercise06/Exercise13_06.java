package chapters.chapter13.Exercise06;

public class Exercise13_06 {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle("blue", true, 16.5);
        ComparableCircle cc2 = new ComparableCircle("purple", true, 20.3);

        System.out.println("\nComparableCircle1:");
        System.out.println(cc1);
        System.out.println("\nComparableCircle2:");
        System.out.println(cc2);

        System.out.println((cc1.compareTo(cc2) == 1 ? "\nComparableCircle1 " : "\nComparableCircle2 ") +
                "is the larger of the two Circles");
    }
}
