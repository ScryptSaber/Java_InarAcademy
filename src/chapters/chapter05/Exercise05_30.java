package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		double amount = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double rate = input.nextDouble();

		System.out.print("Number of months: ");
		int months = input.nextInt();

		double monthlyRate = rate / 1200;
		double oldAccount = 0;
		double newAccount = 0;

		for (int i = 1; i <= 6; i++) {

			oldAccount = (amount + newAccount) * (1 + monthlyRate);
			newAccount = oldAccount;

			System.out.printf(i + ".month " + "%3.3f\n", newAccount);

		}

	}

}
