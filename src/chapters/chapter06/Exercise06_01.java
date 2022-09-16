package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for pentagonal computation: ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 10 == 0) {
				System.out.println(getPentagonalNumber(i));
			} else {
				System.out.printf("%7d",getPentagonalNumber(i));
			}
		}
	}

	public static int getPentagonalNumber(int n) {
		int result;
		result = n * ((3 * n) - 1) / 2;
		return result;
	}
}
