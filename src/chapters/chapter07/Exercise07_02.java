package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {

        System.out.print("Enter 10 numbers: ");
        int[] array = new int[10];

        enterArray(array);
        printReversedArray(array);

    }

    public static void enterArray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }

    }

    public static void printReversedArray(int[] array) {
        System.out.print("reversed array is --> ");
        for (int j = 9; j >= 0; j--) {
            System.out.print(array[j] + " ");

        }
    }
}