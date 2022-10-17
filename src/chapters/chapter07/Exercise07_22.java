package chapters.chapter07;

import java.util.Arrays;

public class Exercise07_22 {
    public static void main(String[] args) {
        int[] queens = {-1, -1, -1, -1, -1, -1, -1, -1};
        int a = 0;

        while (a >= 0 && a < 8) {
            int j = findPosition(a, queens);

            if (j < 0) {
                queens[a] = -1;
                a--;
            } else {
                queens[a] = j;
                a++;
            }
        }
        displayQueens(queens);
    }

    public static int findPosition(int a, int[] queens) {
        int start = queens[a] + 1;

        for (int j = start; j < queens.length; j++) {
            if (isValid(a, j, queens)) {
                return j;
            }
        }
        return -1;
    }

    public static boolean isValid(int row, int column, int[] queens) {
        for (int i = 1; i <= row; i++) {
            if (queens[row - i] == column || queens[row - i] == column - i || queens[row - i] == column + i) {
                return false;
            }
        }
        return true;
    }

    public static void displayQueens(int[] queens) {
        System.out.println(Arrays.toString(queens));

        for (int i = 0; i < queens.length; i++) {
            System.out.print("|");
            for (int j = 0; j < queens[i]; j++) {
                System.out.print(" |");
            }
            System.out.print("Q|");
            for (int k = queens[i] + 1; k < queens.length; k++) {
                System.out.print(" |");
            }
            System.out.println();
        }
    }
}
