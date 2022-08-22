package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt degree in Celsius
		System.out.println("Enter a degree in Celsius: ");

		// Convert celsius to fahrenheit
		double celsius = input.nextInt();
		double fahrenheit = (9 / 5.0) * celsius + 32;

		// Display the result
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}
