package chapters.chapter09.Exercise04;

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        System.out.println("Random Numbers are:");

        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%-5d", random.nextInt(1000));
        }
    }
}
