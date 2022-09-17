package chapters.chapter06;

public class Exercise06_09 {

	public static void main(String[] args) {

		System.out.println("Feet          Meters     |     Meters         Feet");
		System.out.println("------------------------------------------------------");
		for (double f = 1, m = 20; f <= 10 && m <= 65; f++, m += 5) {
			System.out.printf("%-14.1f%-11.3f", f, footToMeter(f));
			System.out.print("|     ");
			System.out.printf("%-14.1f%-14.3f\n", m, meterToFoot(m));
		}
	}

	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}

	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
}
