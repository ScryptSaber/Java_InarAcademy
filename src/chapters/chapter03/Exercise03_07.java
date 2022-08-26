package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 11.56 : ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		System.out.print("Your amount " + amount + " consist of ");
		System.out.print(" " + numberOfDollars + (numberOfDollars == 1 ? " dollar" : " dollars"));
		System.out.print(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
		System.out.print(" " + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));
		System.out.print(" " + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
		System.out.print(" " + numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));

	}

}
