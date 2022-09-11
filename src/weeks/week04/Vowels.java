package weeks.week04;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String s = "Abdullah Erdem Kamis";
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) != 'a' && s.toLowerCase().charAt(i) != 'e' && s.toLowerCase().charAt(i) != 'i'
					&& s.toLowerCase().charAt(i) != 'u' && s.toLowerCase().charAt(i) != 'o') {

				System.out.print(s.toLowerCase().charAt(i));

			}
		}

	}
}