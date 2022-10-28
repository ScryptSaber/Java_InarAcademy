package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_34 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double[] result = getRightmostLowestPoint(points);

        System.out.println("The rightmost lowest points is " + "(" + result[0] + " , " + result[1] + ")");
    }

    public static double[][] getPoints() {
        double[][] points = new double[6][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points: ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double x = points[0][0];
        double y = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < y) {
                y = points[i][1];
                x = points[i][0] = x;

            } else if (y == points[i][1] && points[i][0] > x) {
                y = points[i][1];
                x = points[i][0];
            }
        }

        double[] result = {x, y};
        return result;
    }
}
