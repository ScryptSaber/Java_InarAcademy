package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = input.nextInt();
		String m;
		String bin = "";

		while (num > 0) {
			m = num % 2 + "";
			bin = m + bin;
			num /= 2;
			
		}
		System.out.println("to binary => " + bin);

	}

}
