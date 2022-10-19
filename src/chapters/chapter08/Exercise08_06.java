package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_06 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = getMatrix();

        System.out.print("Enter matrix2: ");
        double[][] matrix2 = getMatrix();

        if (matrix1[0].length == matrix2.length) {
            double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

            displayMultiplication(matrix1, matrix2, matrix3);

        } else {
            System.out.println("It is not possible to do multiplication !");
        }
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

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void displayMultiplication(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        System.out.println("The Multiplication of the matrices is :");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print((i == 1) ? "  *  " : "     ");

            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print((i == 1) ? "  =  " : "     ");

            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.printf("%6.1f",matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
