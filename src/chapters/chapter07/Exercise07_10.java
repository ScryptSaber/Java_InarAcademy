package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The index Of Smallest Element: " + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1) {
            return 0;
        }

        double min = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }
}
