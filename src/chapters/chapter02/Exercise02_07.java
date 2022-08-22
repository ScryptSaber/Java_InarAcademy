package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes : ");

		long minute = input.nextLong();
		int year = (int) (minute / 60 / 24 / 365);

		int day = (int) ((minute / 60 / 24) % 365);

		System.out.println(minute + " minutes is approximately " + year + " and " + day + " days");

	}

}
