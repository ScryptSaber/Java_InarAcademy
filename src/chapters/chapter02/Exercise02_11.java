package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years:");
		int years = input.nextInt();

		int birth = (31536000 / 7);
		int death = (31536000 / 13);
		int immigrant = (31536000 / 45);

		int population = 310232486 + ((birth - death + immigrant) * years);

		System.out.println("The population in " + years + " years is " + population);

	}
}
