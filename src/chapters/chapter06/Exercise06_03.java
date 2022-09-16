package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = input.nextInt();

		System.out.println("Sum of the digits : " + sumDigits(num));

	}

	public static int sumDigits(int num) {
		int sum = 0;
		int k = 0;

		while (num > 0){
			k = num % 10;
			sum += k;
			num /= 10;

		} 
		return sum;

	}

}
