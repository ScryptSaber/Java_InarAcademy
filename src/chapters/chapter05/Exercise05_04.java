package chapters.chapter05;

public class Exercise05_04 {

	public static void main(String[] args) {
		final double KM_PER_MIL = 1.609;

		System.out.println("Miles" + "     " + "Kilometers");

		for (int i = 1; i < 11; i++) {
			System.out.printf("%-10d%5.3f\n", i, (i * KM_PER_MIL));
		}

	}

}
