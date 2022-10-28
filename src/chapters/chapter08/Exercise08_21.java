package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        double[][] points = new double[numberOfCities][2];
        getPoints(points);

        double shortestDistance = Double.MAX_VALUE;
        double p1 = -1;
        double p2 = -1;
        for (int i = 0; i < points.length; i++) {
            double distance = distanceCompute(points[i][0], points[i][1], points);

            if (distance < shortestDistance) {
                shortestDistance = distance;
                p1 = points[i][0];
                p2 = points[i][1];
            }
        }
        System.out.println("Th Central city is at " + "( " + p1 + " ," + p2 + " )");
        System.out.printf("The total distance to all other cities is %.2f ", shortestDistance);
    }

    public static void getPoints(double[][] points) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the cities: ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
    }

    public static double distanceCompute(double p1, double p2, double[][] points) {
        double totalDistance = 0;

        for (int i = 0; i < points.length; i++) {
            totalDistance += Math.sqrt(Math.pow(points[i][0] - p1, 2) + Math.pow(points[i][1] - p2, 2));
        }
        return totalDistance;

    }
}

