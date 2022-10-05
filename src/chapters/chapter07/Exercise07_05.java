package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] distinctNumbers = new int[10];
        System.out.print("Enter ten numbers: ");

        int count = 0;
        int num;
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }

        printDistinctNumbers(distinctNumbers, count);

    }
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return false;
            }
        }
        return true;
    }
    public static void printDistinctNumbers(int[] array, int count) {
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The Distinct numbers are ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                System.out.print(array[i] + " ");
        }
    }
}
