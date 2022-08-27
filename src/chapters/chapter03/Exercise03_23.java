package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates (x,y) : ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 || Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2) {

			System.out.println("Point (" + x + "," + y + ") is in the rectangle");

		} else {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
		}

	}

}
