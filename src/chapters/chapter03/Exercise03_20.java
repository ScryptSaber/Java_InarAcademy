package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
		double temperature = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour :");
		double speed = input.nextDouble();

		if (temperature <= -58 || temperature > 41 || speed < 2) {
			System.out.print("The ");
			
			if (temperature <= -58 || temperature > 41) {
				System.out.print("temperature ");
			}
			if ((temperature <= -58 || temperature > 41) && speed < 2) {
				System.out.print("and ");
			}
			if (speed < 2)
				System.out.print("wind speed ");
			
			System.out.println("invalid");
			System.exit(1);

		}

		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
				+ 0.4275 * temperature * Math.pow(speed, 0.16);

		System.out.println("The wind chill index is " + windChill);
	}

}
