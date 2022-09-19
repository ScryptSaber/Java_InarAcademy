package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_18 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String s = input.next();

		System.out.print("Password is ");

		if (isValid(s)) {
			System.out.println("valid ");
		} else {
			System.out.println("invalid");
		}
	}

	public static boolean isValid(String s) {
		int count = 0;
		if (s.length() < 8) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'
					|| s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				return false;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;
			}
		}
		if (count < 2) {

			return false;
		}
		return true;
	}
}