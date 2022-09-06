package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0 :");
		int n = input.nextInt();
		int positive = 0;
		int negative = 0;
		int sum = 0;
		int count = 0;

		if (n == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		while (n != 0) {
			if (n > 0) {
				positive++;
			} else {
				negative++;
			}

			sum += n;
			count++;
			n = input.nextInt();
		}

		double average = sum / (double) count;

		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}
}
