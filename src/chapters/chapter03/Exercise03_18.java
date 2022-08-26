package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight of the package (in pounds) : ");
		double weight = input.nextDouble();

		// Calculate cost of shipping
		if (weight > 20) {
			System.out.println("The package cannot be shipped.");
		} else {
			double costPerPound;
			if (weight > 0 && weight <= 1) {
				costPerPound = 3.5;
			} else if (weight <= 3) {
				costPerPound = 5.5;
			} else if (weight <= 10) {
				costPerPound = 8.5;
			} else {
				costPerPound = 10.5;

			}
			System.out.println("Shipping cost of package is $" + costPerPound * weight);
		}
	}
}
