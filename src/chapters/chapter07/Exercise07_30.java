package chapters.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the values: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        if (isConsecutiveFour(array)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }

    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 4; i++) {

            if (values[i] == values[i + 1] && values[i + 2] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
