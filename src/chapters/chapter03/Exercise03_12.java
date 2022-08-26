package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer :");
		int number = input.nextInt();
		
		int firstDigit = number / 100;
		int thirdDigit = number % 10;
		
		if (firstDigit == thirdDigit) {
			System.out.println(number + " is polindrome.");
		}else {
			System.out.println(number + " is not polindrome.");
		}
	}

}
