package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.println("What is " + number1 + " + " + number2 + " = ?");
		int answer = input.nextInt();
		
		if (number1 + number2 == answer) {
			System.out.println("You are correct !");
		}else {
			System.out.println("You are wrong !  " + number1 + " + " + number2 + " should be " + (number1+number2));
		}
	}

}
