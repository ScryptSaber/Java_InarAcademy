package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter an integer from 1 to 15 : ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i) * 2; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print((i - k) + " ");
			}
			for (int m = 1; m <= i - 1; m++) {
				System.out.print(m+1 + " ");
			}

			System.out.println();
		}
	}
}
