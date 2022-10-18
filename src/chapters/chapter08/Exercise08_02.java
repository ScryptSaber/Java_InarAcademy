package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_02 {
    public static void main(String[] args) {

        double[][] m = getMatrix();

        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }

    public static double[][] getMatrix() {

        Scanner input = new Scanner(System.in);

        final int ROWS = 4;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0, j = 0; i < m.length; i++, j++) {
            sum += m[i][j];
        }
        return sum;
    }
}

