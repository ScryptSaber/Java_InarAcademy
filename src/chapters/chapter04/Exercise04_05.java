package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		double area = n * s * s / (4 * Math.tan(Math.PI / n));

		System.out.println("The area of the polygon is " + area);

	}

}
