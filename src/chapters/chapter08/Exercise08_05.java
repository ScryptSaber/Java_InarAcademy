package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = getMatrix();

        System.out.print("Enter matrix2: ");
        double[][] matrix2 = getMatrix();

        double[][] matrix3 = addMatrix(matrix1, matrix2);

        displaySum(matrix1, matrix2, matrix3);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static double[][] getMatrix() {
        double[][] array = new double[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    public static void displaySum(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        System.out.println("The matrices are added as follows :");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print((i == 1) ? "  +  " : "     ");

            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print((i == 1) ? "  =  " : "     ");

            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
