package chapters.chapter05;

public class Exercise05_06 {

	public static void main(String[] args) {
		final double KM_PER_MIL = 1.609;

		System.out.println("Miles" + "     " + "Kilometers" + "   |   " + "Kilometers" + "    " + "Miles");

		for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {

			System.out.printf("%-10d%-10.3f", m, (m * KM_PER_MIL));

			System.out.print("   |   ");

			System.out.printf("%-14d%-7.3f\n", k, (k / KM_PER_MIL));
		}

	}

}
