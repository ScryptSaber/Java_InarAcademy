package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {

        int[] array = new int[100];
        System.out.print("Enter the integers between 1 and 100:");

        count(array);
        displayResults(array);

    }

    public static void count(int[] array) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if (num > 0 && num <= 100) {
                array[num - 1]++;
            }
        } while (num != 0);

    }

    public static void displayResults(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println((i + 1) + " occurs " + array[i] + " time" + (array[i] > 1 ? "s" : ""));
            }
        }
    }
}
