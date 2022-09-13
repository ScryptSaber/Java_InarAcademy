package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		int uppLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				uppLetters++;
			}
		}
		System.out.println("The number of uppercase letters is " + uppLetters);
	}

}
