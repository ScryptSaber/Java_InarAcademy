package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();

		String commonPrefix = "";
		boolean hasCommon = false;

		for (int i = 0; i < (s1.length() < s2.length() ? s1.length() : s2.length()); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				hasCommon = true;
				commonPrefix += s1.charAt(i);

			} else {
				hasCommon = false;
			}
		}
		if (hasCommon) {
			System.out.println("The common prefix is " + commonPrefix);
		} else {
			System.out.println(s1 + " and " + s2 + " have no common prefix");
		}
	}

}
