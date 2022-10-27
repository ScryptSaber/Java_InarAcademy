package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();

        char[][] list = getArrayFromUser(n);

        System.out.println("The input array is" + (isLatinSquare(list) ? "" : " not") + " a Latin square");


    }

    public static char[][] getArrayFromUser(int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.next().charAt(0);

                if (matrix[i][j] < 'A' || matrix[i][j] > ('A' + n - 1)) {
                    System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + n - 1));
                    System.exit(1);
                }
            }
        }
        return matrix;
    }

    public static boolean isLatinSquare(char[][] matrix) {
        if (!(checkRow(matrix) && checkColumn(matrix))) {
            return false;
        }
        return true;
    }

    public static boolean checkRow(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean[] row = new boolean[matrix.length];
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[matrix[i][j] - 'A']) {
                    return false;
                } else {
                    row[matrix[i][j] - 'A'] = true;
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(char[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            boolean[] column = new boolean[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                if (column[matrix[j][i] - 'A']) {
                    return false;
                } else {
                    column[matrix[j][i] - 'A'] = true;
                }
            }
        }
        return true;
    }
}


