package chapters.chapter09.Exercise13;

import java.util.Scanner;

public class Exercise09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = getMatrixFromUser(row, column, input);

        Location l1 = locateLargest(matrix);

        System.out.println(l1.toString());
    }

    public static double[][] getMatrixFromUser(int row, int column, Scanner input) {
        System.out.println("Enter the array: ");
        double[][] m = new double[row][column];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }

    public static Location locateLargest(double[][] a) {
        int row = -1;
        int col = -1;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        Location location = new Location(row, col, max);
        return location;
    }
}
