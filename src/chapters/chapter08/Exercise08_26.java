package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();
        displayMatrix(matrix);

        double[][] matrixSorted = copyMatrix(matrix);
        sortRows(matrixSorted);

        System.out.println("The row-sorted array is");
        displayMatrix(matrixSorted);

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

    public static double[][] copyMatrix(double[][] matrix) {
        double[][] matrixSorted = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSorted[i][j] = matrix[i][j];
            }
        }
        return matrixSorted;
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length - 1; col++) {

                double min = m[row][col];
                int minIndex = col;

                for (int j = col + 1; j < m.length; j++) {
                    if (m[row][j] < min) {
                        min = m[row][j];
                        minIndex = j;

                    }
                }
                if (minIndex != col) {
                    m[row][minIndex] = m[row][col];
                    m[row][col] = min;
                }
            }
        }
        return m;
    }
}
