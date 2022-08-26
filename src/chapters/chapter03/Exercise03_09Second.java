package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_09Second {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();

		int d1 = (isbn / 100000000);
		int d2 = (isbn / 10000000) % 10;
		int d3 = (isbn / 1000000) % 10;
		int d4 = (isbn / 100000) % 10;
		int d5 = (isbn / 10000) % 10;
		int d6 = (isbn / 1000) % 10;
		int d7 = (isbn / 100) % 10;
		int d8 = (isbn / 10) % 10;
		int d9 = (isbn / 1) % 10;

		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		System.out.print("The ISNB-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

		if (checksum == 10) {
			System.out.print("X");

		} else {
			System.out.print(checksum);
		}

	}

}
