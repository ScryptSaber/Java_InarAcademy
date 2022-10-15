package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_13 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Number generated: " + getRandom(numbers));
    }

    public static int getRandom(int... numbers) {

        int random = 1 + (int) (Math.random() * 53);
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = 1 + (int) (Math.random() * 53);
                i = 0;
            }
        }
        return random;
    }
}
