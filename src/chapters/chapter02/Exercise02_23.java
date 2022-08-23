package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double drivigDistance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = drivigDistance / milesPerGallon * pricePerGallon;
		
		System.out.println("The cost of driving is " + costOfDriving);
	}

}
