package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 integers : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b && b > c) {
			System.out.println("Increasing order : " + c + " " + b + " " + a);

		}
		if (a > c && c > b) {
			System.out.println("Increasing order : " + b + " " + c + " " + a);
		}
		if (b > a && a > c) {
			System.out.println("Increasing order : " + c + " " + a + " " + b);
		}
		if (b > c && c > a) {
			System.out.println("Increasing order : " + a + " " + c + " " + b);
		}
		if (c > b && b > a) {
			System.out.println("Increasing order : " + a + " " + b + " " + c);

		}
		if (c > a && a > b) {
			System.out.println("Increasing order : " + b + " " + a + " " + c);
		}

	}

}
