package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		double distance = Math.pow((x1 * x1 + y1 * y1), 0.5);
		int radius = 10;

		if (distance <= radius) {
			System.out.println("Point (" + x1 + "," + y1 + ") is in the circle.");
		} else {
			System.out.println("Point (" + x1 + "," + y1 + ") is not in the circle.");

		}
	}

}
