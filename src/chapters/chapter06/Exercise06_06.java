package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = input.nextInt();

		displayPattern(num);

	}

	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k > 0; k--) {
				System.out.printf("%2d", k);
			}
			System.out.println();
		}

	}
}
