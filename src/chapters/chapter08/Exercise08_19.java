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
        return (isConsecutiveFourAtRows(m) ||
                isConsecutiveFourAtColumns(m));    //||)
        //TODO  isConsecutiveFourAtRightDiagonal(m) ||
        //TODO  isConsecutiveFourAtLeftDiagonal(m));
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


}
