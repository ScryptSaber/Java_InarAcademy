package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(s.charAt(i));
			}

		}

	}

}
