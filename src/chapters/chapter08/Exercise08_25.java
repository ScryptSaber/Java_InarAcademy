package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();

        displayMatrix(matrix);
        System.out.println("It is" + (isMarkovMatrix(matrix) ? "" : " not") + " a Markov Matrix");
    }

    public static double[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        double sumColumn;

        for (int j = 0; j < m[0].length; j++) {
            sumColumn = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i][j] < 0) {
                    return false;
                }
                sumColumn += m[i][j];
            }
            if (sumColumn != 1.0) {
                return false;
            }
        }
        return true;
    }
}

