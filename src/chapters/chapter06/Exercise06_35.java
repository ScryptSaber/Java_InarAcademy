package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        printAreaOfPentagon(side);
    }

    public static void printAreaOfPentagon(double side) {
        System.out.println("The area of the pentagon is " + area(side));

    }

    public static double area(double s) {
        double a = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        return a;
    }
}
