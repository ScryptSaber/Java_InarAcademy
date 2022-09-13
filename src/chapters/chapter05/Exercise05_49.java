package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i'
					|| s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') {
				vowels++;
			} else if (s.toLowerCase().charAt(i) == ' ') {
				continue;
			} else {
				consonants++;
			}

		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
	}
}
