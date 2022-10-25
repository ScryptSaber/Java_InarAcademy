package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_28 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] m1 = getMatrixFromUser();

        System.out.print("Enter list2: ");
        int[][] m2 = getMatrixFromUser();

        System.out.println("The two arrays are" + (equals(m1, m2) ? "" : " not") + " strictly identical");

    }

    public static int[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean equals(int[][] m1, int[][] m2) {

        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
