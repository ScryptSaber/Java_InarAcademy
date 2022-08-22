package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000 : ");

		int number = input.nextInt();
		int d = number / 100;
		int b = number / 10;
		int c = b % 10;
		int e = number % 10;

		System.out.println("The sum of the digits is " + (e + d + c));

	}

}
