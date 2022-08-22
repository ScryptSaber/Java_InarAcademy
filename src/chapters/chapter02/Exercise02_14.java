package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// kg and meter equivalence 
		final double ONE_POUND = 0.45359237;
		final double ONE_INCH = 0.0254;

		// Prompt the user to enter a weight in pounds
		System.out.println("Enter weight in pounds :");
		double weight = input.nextDouble();

		// Prompt the user to enter height in inches
		System.out.println("Enter height in inches :");
		double height = input.nextDouble();

		// Compute BMI
		double bmi = (weight * ONE_POUND) / ((ONE_INCH * height) * (ONE_INCH * height));

		System.out.println("BMI is " + bmi);

	}

}
