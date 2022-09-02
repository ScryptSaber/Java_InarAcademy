package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string s1: ");
		String string1 = input.next();
		System.out.print("Enter string s2: ");
		String string2 = input.next();

		if (string1.contains(string2)) {
			System.out.println(string1 + " is a substring of " + string2);
		} else {
			System.out.println(string1 + " is not a substring of " + string2);
		}
	}

}
