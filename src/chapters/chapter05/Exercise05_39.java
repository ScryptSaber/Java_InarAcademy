package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_39 {

	public static void main(String[] args) {

		double commision = 0;
		double salesAmount = 30000;
		double salary = 5000;

		while (commision + salary < 30_000) {
			commision = 0;
			commision += 5000 * 0.08;
			commision += 5000 * 0.10;
			commision += (salesAmount - 10000) * 0.12;
			salesAmount += 0.01;
		}

		System.out.printf("\nMinimum sales to earn $30,000: $%.2f\n", salesAmount);
	}

}
