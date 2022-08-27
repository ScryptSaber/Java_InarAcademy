package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		byte convert = input.nextByte();

		if (convert == 0) {
			System.out.print("Enter the dollar amount: ");
			double dollar = input.nextDouble();

			System.out.println("$" + dollar + " is " + (dollar * exchangeRate) + " yuan");
		} else if (convert == 1) {
			System.out.print("Enter the RMB amount: ");
			double rmb = input.nextDouble();

			System.out.print(rmb + " yuan" + " is " + "$" + (rmb / exchangeRate));

		}else {
			System.out.println("No convert option ---- Please enter 0 or 1");
		}

	}

}
