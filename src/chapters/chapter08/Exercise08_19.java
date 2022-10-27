package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args) {
        int[][] array = getFromUser();

        System.out.print("Matrix has" + ((isConsecutiveFour(array)) ? "" : " not") +
                " consecutive four numbers");
    }

    public static int[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = input.nextInt();
        System.out.print("Enter column number: ");
        int column = input.nextInt();

        int[][] m = new int[row][column];
        System.out.println("Fill the matrix: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    public static boolean isConsecutiveFour(int[][] m) {
        return (isConsecutiveFourAtRows(m) || isConsecutiveFourAtColumns(m) || isConsecutiveFourAtDiagonal(m));

    }

    public static boolean isConsecutiveFourAtRows(int[][] m) {
        int count;
        for (int i = 0; i < m.length; i++) {
            count = 1;
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] == m[i][j + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtColumns(int[][] m) {
        int count;
        for (int j = 0; j < m[0].length; j++) {
            count = 1;
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][j] == m[i + 1][j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtDiagonal(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (isLeftDiagonal(i, j, m) || isRightDiagonal(i, j, m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isRightDiagonal(int row, int column, int[][] matrix) {

        if (row >= matrix.length - 3) {
            return false;
        }
        if (column >= matrix[0].length - 3) {
            return false;
        }
        int number = matrix[row][column];

        int count = 1;

        for (int i = 1; i < 4; i++) {
            if (number == matrix[row + i][column + i]) {
                count++;
            }
        }

        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeftDiagonal(int row, int column, int[][] matrix) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }

        int number = matrix[row][column];

        for (int i = 1; i < 4; i++) {
            if (number != matrix[row + i][column - i]) {
                return false;
            }
        }
        return true;
    }
}
