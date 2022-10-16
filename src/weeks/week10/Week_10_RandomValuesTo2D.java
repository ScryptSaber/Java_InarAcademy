package weeks.week10;

import java.util.Scanner;

public class Week_10_RandomValuesTo2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array row number: ");
        int row = input.nextInt();

        System.out.print("Enter Array column number: ");
        int column = input.nextInt();

        int[][] array = new int[row][column];

        fill2DArrayWithRandomValues(array);
        findTheMaxSumOfRow(array);
        findTheMaxSumOfColumn(array);


    }

    public static void fill2DArrayWithRandomValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void findTheMaxSumOfRow(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("The Max sum of row index is: " + maxSumIndex);
    }

    public static void findTheMaxSumOfColumn(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = -1;

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("The Max sum of column index is: " + maxSumIndex);


    }
}
