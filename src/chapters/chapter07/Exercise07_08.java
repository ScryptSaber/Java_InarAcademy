package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter ten double values: ");

        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("average of this array is " + average(array));

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
