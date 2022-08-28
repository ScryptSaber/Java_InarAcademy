package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double c1x = input.nextDouble();
		double c1y = input.nextDouble();
		double c1radius = input.nextDouble();

		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double c2x = input.nextDouble();
		double c2y = input.nextDouble();
		double c2radius = input.nextDouble();

		double distance = Math.pow(((c2x - c1x) * (c2x - c1x) + (c2y - c1y) * (c2y - c1y)), 0.5);

		if (distance <= Math.abs(c1radius - c2radius)) {
			System.out.println("circle2 is inside circle1");
		} else if (distance > c1radius + c2radius) {
			System.out.println("circle2 does not overlap circle1");
		} else {
			System.out.println("circle2 overlaps circle1");
		}

	}

}
