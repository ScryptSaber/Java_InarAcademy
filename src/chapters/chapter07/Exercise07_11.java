package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.printf("The mean is %1.2f", mean(array));
        System.out.printf("\nThe standard deviation is %1.5f", deviation(array));
    }

    public static double mean(double[] x) {

        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (double e : x) {
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
}