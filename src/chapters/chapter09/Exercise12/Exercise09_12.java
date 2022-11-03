package chapters.chapter09.Exercise12;

import chapters.chapter09.Exercise11.Exercise09_11;
import chapters.chapter09.Exercise11.LinearEquation;

import java.util.Scanner;

public class Exercise09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation linearEq = new LinearEquation(a, b, c, d, e, f); //I used here,Exercise11 class.

        if (linearEq.isSolvable()) {
            System.out.println("The intersecting point is at (" + linearEq.getX() + " , " + linearEq.getY() + ")");
        } else {
            System.out.println("Two lines are paralel");
        }
    }
}
