package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
		int a = input.nextInt();

		System.out.println("The character for ASCII code 69 is " + (char) a);

	}

}
