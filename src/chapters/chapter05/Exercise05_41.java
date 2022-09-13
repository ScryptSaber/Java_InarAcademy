package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 1;
		int count = 1;
		int number;

		System.out.print("Enter numbers: ");
		do {

			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;

			} else if (number == max) {
				count++;
			}

		} while (number != 0);

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is  " + count);

	}

}
