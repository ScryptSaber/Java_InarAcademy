package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point's x and y coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		System.out.print("The point is ");

		if (x <= 200 && x >= 0 && y <= 100 && y >= 0 && (y / (200 - x) <= 0.5)) {
			System.out.println("in the triangle");

		} else {
			System.out.println("not in the triangle");
		}

	}
}
