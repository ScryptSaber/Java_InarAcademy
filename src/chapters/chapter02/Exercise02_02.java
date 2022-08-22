package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt a input from user
		System.out.println("Enter the radius and length of a cylinder: ");

		// Describe variables
		final double PI = 3.14159;
		double radius = input.nextDouble();
		double length = input.nextDouble();

		// Compute the problem
		double area;
		double volume;

		area = radius * radius * PI;
		volume = area * length;

		// Display the results
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);

	}

}
