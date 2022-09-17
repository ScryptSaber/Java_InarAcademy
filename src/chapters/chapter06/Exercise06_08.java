package chapters.chapter06;

public class Exercise06_08 {

	public static void main(String[] args) {
		System.out.println("Celcius       Fahrenheit       |       Fahrenheit       Celcius");
		System.out.println("---------------------------------------------------------------");

		for (double c = 40, f = 120; c >= 31 && f >= 30; c--, f -= 10) {

			System.out.printf("%-14.1f%-17.1f", c, celsiusToFahrenheit(c));
			System.out.print("|       ");
			System.out.printf("%-17.1f%-14.2f\n", f, fahrenheitToCelsius(f));

		}
	}

	public static double celsiusToFahrenheit(double celsius) {

		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
}
