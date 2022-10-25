package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] m1 = getMatrixFromUser();

        System.out.print("Enter list2: ");
        int[][] m2 = getMatrixFromUser();

        System.out.println("The two arrays are" + (equals(m1, m2) ? "" : " not") + " identical");

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
        int[] list1 = sort(m1);
        int[] list2 = sort(m2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static int[] matrixToArray(int[][] m) {
        int[] list = new int[m.length * m[0].length]; //length=9
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                list[k] = m[i][j];
                k++;
            }
        }
        return list;
    }

    public static int[] sort(int[][] m) {
        int[] list = matrixToArray(m);
        for (int i = 0; i < list.length - 1; i++) {

            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }
}
