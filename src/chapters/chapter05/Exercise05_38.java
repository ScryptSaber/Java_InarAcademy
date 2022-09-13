package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = input.nextInt();
		String m;
		String octal = "";

		while (num > 0) {
			m = num % 8 + "";
			octal = m + octal;
			num /= 8;

		}
		System.out.println("to octal => " + "0" + octal);

	}

}
