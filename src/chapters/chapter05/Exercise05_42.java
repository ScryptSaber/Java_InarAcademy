package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter commission sought: ");
		double COMMISSION_SOUGHT = input.nextDouble();

		double commission = 0;
		double salesAmount;
		double salary = 5000;

		for (salesAmount = COMMISSION_SOUGHT; commission + salary < COMMISSION_SOUGHT; salesAmount += 0.01) {
			commission = 0;
			commission += 5000 * 0.08;
			commission += 5000 * 0.10;
			commission += (salesAmount - 10_000) * 0.12;
		}
		System.out.printf("\nMinimum sales to earn $30,000: $%.2f\n", salesAmount);
	}

}
