package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("( 1 for head, 0 for tail) %50 chance hah.. !Enter your guess !  ");

		int guess = input.nextInt();

		int flip = (int) (Math.random() * 2);
		

		if (guess == flip) {
			System.out.println("Your guess is correct :) ");
		} else {
			System.out.println("Your guess is incorrect :( ");
		}

	}

}
