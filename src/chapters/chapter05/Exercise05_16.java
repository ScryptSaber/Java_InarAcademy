package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int factor = 2;

		while (number / factor != 1) {
			if (number % factor == 0) {
				number /= factor;
				System.out.print(factor + " , ");

			} else {
				factor++;
			}

		}

		System.out.println(number + ".");
	}

}
