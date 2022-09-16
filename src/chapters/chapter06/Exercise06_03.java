package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = input.nextInt();

		System.out.print(num + " is ");
		if (isPalindrome(num)) {
			System.out.print("palindrome");
		} else {
			System.out.print("is not palindrome");
		}

	}

	public static int reverse(int n) {

		int k = 0;
		int reversed = 0;

		while (n > 0) {
			k = n % 10;
			reversed = reversed * 10 + k;
			n /= 10;
		}
		return reversed;
	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}

	}

}
