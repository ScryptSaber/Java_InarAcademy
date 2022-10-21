package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] array = createArrayWithRandomValues(size);
        displayArray(array);

        displayRowControl(array);
        displayColumnControl(array);
        displayMajorDiagonalControl(array);
        displaySubDiagonalControl(array);

    }

    public static int[][] createArrayWithRandomValues(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void displayRowControl(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            boolean isSameRow = true;
            int number = m[i][0];
            for (int j = 1; j < m[i].length; j++) {
                if (number != m[i][j]) {
                    isSameRow = false;
                }
            }
            if (isSameRow) {
                System.out.println("All " + number + "s on row " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void displayColumnControl(int[][] m) {
        int count = 0;
        for (int j = 0; j < m[0].length; j++) {
            boolean isSameColumn = true;
            int number = m[0][j];
            for (int i = 1; i < m.length; i++) {
                if (number != m[i][j]) {
                    isSameColumn = false;
                }
            }
            if (isSameColumn) {
                System.out.println("All " + number + "s on column " + j);
                count++;
            }

        }
        if (count == 0) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void displayMajorDiagonalControl(int[][] m) {
        int count = 0;
        int number = m[0][0];
        boolean isSameMajorDiagonal = true;
        for (int i = 1; i < m.length; i++) {
            if (number != m[i][i]) {
                isSameMajorDiagonal = false;
            }
        }
        if (isSameMajorDiagonal) {
            System.out.println("All " + number + " s on major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void displaySubDiagonalControl(int m[][]) {
        int count = 0;
        int number = m[0][m.length - 1];
        boolean isSameSubDiagonal = true;

        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            if (number != m[i][j]) {
                isSameSubDiagonal = false;
            }
        }
        if (isSameSubDiagonal) {
            System.out.println("All " + number + "s on sub-diagonal");
        } else {
            System.out.println("No same numbers on the subdiagonal");
        }
    }
}
