package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter feet: ");
		double height = input.nextDouble();
		
		System.out.print("Enter inches: ");
		double inch = input.nextDouble();
		
		final double KG_PER_POUND = 0.45359237;
		final double METERS_PER_INCH =0.0254;
		
		double weightInKg = weight * KG_PER_POUND;
		double heightInMeters =((height * 12)+ inch) * METERS_PER_INCH;
		
		double bmi = weightInKg / (heightInMeters * heightInMeters);
		System.out.println("BMI is " + bmi);
		
		if( bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if	(bmi < 25 ) {
			System.out.println("Normal");
		}
		else if (bmi < 30) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}

}
