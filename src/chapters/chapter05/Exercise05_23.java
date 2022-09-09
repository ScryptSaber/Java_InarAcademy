package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter n: ");
		int n = input.nextInt();
		double sum1 = 0;
		double sum2 = 0;

		for (int i = n; i >= 1; i--) {
			sum1 += 1.0 / i;

		}
		System.out.println("right to left sum= " + sum1);

		for (int i = 1; i <= n; i++) {
			sum2 += 1.0 / i;
		}

		System.out.println("left to right sum= " + sum2);

		double diff = sum1 - sum2;
		System.out.println("\nDiff between two is " + diff);

	}

}
