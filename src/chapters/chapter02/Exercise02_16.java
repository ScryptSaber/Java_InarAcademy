package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the side: ");
		double s = input.nextDouble();

		double area = (3 * (Math.pow(3, 0.5))) * s * s / 2;

		System.out.println("The area of the hexagon is " + area);

	}

}
