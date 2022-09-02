package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a sting: ");
		String s = input.nextLine();

		System.out.println(s + " has a length of " + s.length() +" and its first character is " + s.charAt(0));

	}

}
