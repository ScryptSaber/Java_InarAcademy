package chapters.chapter05.checkpoint05;

import java.util.Scanner;

public class Checkpoint05_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, max;
		number = input.nextInt();
		max = number;
		while (number != 0) {
		number = input.nextInt();
		if (number > max)
		max = number;
		}
		System.out.println("max is " + max);
		System.out.println("number " + number);

	}

}
