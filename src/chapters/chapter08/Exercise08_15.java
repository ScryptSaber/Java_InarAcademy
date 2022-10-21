package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_15 {
    public static void main(String[] args) {

        double[][] points = getMatrix();
        boolean isOnSameLine = isOnSameLine(points);

        System.out.println("The five points are " + (isOnSameLine ? "" : "not ") + "on the same line.");
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points : ");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }

    public static boolean isOnSameLine(double[][] points) {

        int p0= 0;
        int p1 = points.length - 1;
        int p2;

        for (int i = 1; i < points.length - 1; i++) {
            p2 = i;
            boolean isOnTheSameLine = (points[p1][0] - points[p0][0]) * (points[p2][1] - points[p0][1]) -
                                      (points[p2][0] - points[p0][0]) * (points[p1][1] - points[p0][1]) == 0;

            if (!isOnTheSameLine){
                return false;
            }
        }
        return true;
    }
}
