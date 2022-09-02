package weeks.week03;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();

		int digit1 = num / 1000;
		int digit2 = (num % 1000) / 100;
		int digit3 = (num % 100) / 10;
		int digit4 = num % 10;

		System.out.println("Reversed : " + digit4 + digit3 + digit2 + digit1);
	}

}
