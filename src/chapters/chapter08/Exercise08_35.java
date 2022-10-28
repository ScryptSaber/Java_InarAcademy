package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {
        int[][] matrix = getFromUser();

        displayResult(findLargestBlock(matrix));
    }

    public static int[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int row = input.nextInt();

        int[][] matrix = new int[row][row];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }


    public static int[] findLargestBlock(int[][] m) {
        int[] array = new int[3];
        int size = 2;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                while (isSquare(m, i, j, size)) {
                    array[0] = i;
                    array[1] = j;
                    array[2] = size;
                    size++;
                }
            }
        }
        return array;
    }

    public static boolean isSquare(int[][] m, int row, int column, int count) {

        if (column + count > m[0].length) {
            return false;
        }

        if (row + count > m.length) {
            return false;
        }

        for (int i = row; i < row + count; i++) {
            for (int j = column; j < column + count; j++) {
                if (m[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayResult(int[] array) {
        System.out.println("The maximum square submatrix is at (" + array[0] + "," + array[1] + ")" +
                " with size " + array[2]);
    }
}
