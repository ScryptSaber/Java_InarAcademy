package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array:");
        int row = input.nextInt();
        int column = input.nextInt();

        System.out.println("Enter the array:");
        double[][] array = getArray(input, row, column);

        int[] list = locateLargest(array);

        System.out.println("The location of the largest element is at (" + list[0] + "," + list[1] + ")");

    }

    public static double[][] getArray(Scanner input, int row, int column) {
        double[][] array = new double[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    public static int[] locateLargest(double[][] a) {
        int[] list = new int[2];
        double largest = Double.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    list[0] = i;
                    list[1] = j;
                }
            }
        }
        return list;
    }
}
