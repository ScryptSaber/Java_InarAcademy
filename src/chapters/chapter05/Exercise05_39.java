package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_39 {

	public static void main(String[] args) {

		final double GOAL_COMMISSION = 30000;
		double salesAmount, commission, balance;
		salesAmount = 0;
		int count = 0;
		do {
			balance = commission = 0;
			salesAmount += 0.01;

			if (salesAmount > 10000)
				commission += (balance = salesAmount - 10000) * 0.12;

			if (salesAmount > 5000)
				commission += (balance -= balance - 5000) * 0.10;

			if (salesAmount > 0)
				commission += balance * 0.08;
			count++;
		} while (commission < GOAL_COMMISSION);

		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
		System.out.println(count);
	}

}
