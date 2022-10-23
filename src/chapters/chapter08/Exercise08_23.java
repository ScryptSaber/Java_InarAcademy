package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_23 {
    public static void main(String[] args) {
        int[][] matrix = getMatrixFromUser();
        displayMatrix(matrix);
        int row = findTheViolatedRow(matrix);
        int column = findTheViolatedColumn(matrix);

        System.out.println("The Flipped cell is at (" + row + " , " + column + ")");
    }

    public static int[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix: ");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findTheViolatedRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findTheViolatedColumn(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return j;
            }
        }
        return -1;
    }

}
