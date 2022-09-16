package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = input.nextInt();

		System.out.println(num + " reversed to " + reverse(num));

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
}
