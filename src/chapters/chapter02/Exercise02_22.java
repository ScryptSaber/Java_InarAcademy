package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount as integer, for example 1156 for 11.56: ");

		int amount = input.nextInt();

		int numberOfDollars = amount / 100;

		int remainingAmount = amount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

	}

}
