package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Number of Years: ");
		int years = input.nextInt();

		double monthlyInterestRate;
		double monthlyPayment;

		System.out.println("Interest Rate    Monthly Payment    Total Payment");

		for (double i = 5.0; i <= 8.0; i += 0.125) {
			System.out.printf("%-5.3f", i);
			System.out.print("%           ");

			monthlyInterestRate = i / 1200;
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));

			System.out.printf("%-19.2f", monthlyPayment);
			System.out.printf("%-8.2f\n", (monthlyPayment * 12) * years);
		}

	}

}
