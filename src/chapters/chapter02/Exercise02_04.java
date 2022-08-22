package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number in pounds: ");

		double pound = input.nextDouble();

		// Convert to kg
		final double onePound = 0.454;
		double result = pound * onePound;
        
		//Display the results
		System.out.println(pound + " pounds " + result + "kilograms" );
	}

}
