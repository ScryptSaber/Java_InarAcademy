package chapters.chapter05.checkpoint05;

import java.util.Scanner;

public class Checkpoint05_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number;
		do {
			System.out.print("Enter an integer (the input ends if it is 0) : ");
			number = input.nextInt();
			sum += number;
		} while (number != 0);

	}

}
