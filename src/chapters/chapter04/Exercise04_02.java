package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double RADIUS = 6371.01;
		
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double p1x = input.nextDouble();
		double p1y = input.nextDouble();
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double p2x = input.nextDouble();
		double p2y = input.nextDouble();
		
		p1x = Math.toRadians(p1x);
		p1y = Math.toRadians(p1y);
		p2x = Math.toRadians(p2x);
		p2y = Math.toRadians(p2y);
		
		double d = RADIUS *  Math.acos(Math.sin(p1x) * Math.sin(p2x) + 
				Math.cos(p1x) * Math.cos(p2x) * Math.cos(p1y - p2y));
		
		System.out.println("The distance between the two points is " + d);

	}

}
