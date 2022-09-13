package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");

		String s = input.next();
		String reversed = "";

		for (int i = 0; i < s.length(); i++) {
			reversed = s.charAt(i) + reversed;
		}
		System.out.println("The reversed string is " + reversed);
	}

}
