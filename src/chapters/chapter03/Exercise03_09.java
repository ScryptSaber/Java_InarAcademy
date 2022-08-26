package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();

		int d1 = (isbn / 100000000);
		int d2 = (isbn / 10000000) % 10;
		int d3 = (isbn / 1000000) % 10;
		int d4 = (isbn / 100000) % 10;
		int d5 = (isbn / 10000) % 10;
		int d6 = (isbn / 1000) % 10;
		int d7 = (isbn / 100) % 10;
		int d8 = (isbn / 10) % 10;
		int d9 = (isbn / 1) % 10;

		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (checksum == 10) {
			if ( d1 ==0) {
				System.out.println("The ISBN-10 number is " +"0"+ isbn + "X");
			}else {
				System.out.println("The ISBN-10 number is " + isbn + "X");
			}
		}else {
			if (d1 ==0) {
				System.out.println("The ISBN-10 number is " +"0"+ isbn + "" + checksum);
			}else {	
				System.out.println("The ISBN-10 number is " + isbn + "" + checksum);
			}
		}

	}

}
