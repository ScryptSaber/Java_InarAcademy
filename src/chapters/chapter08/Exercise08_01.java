package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        for (int j = 0; j < m[0].length; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(m, j));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
