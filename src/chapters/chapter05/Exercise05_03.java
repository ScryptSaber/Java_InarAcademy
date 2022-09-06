package chapters.chapter05;

public class Exercise05_03 {

	public static void main(String[] args) {
		final double POUND_PER_KG = 2.2;

		System.out.println("Kilograms" + "    " + "Pounds");
		for (int i = 1; i < 200; i++) {
			System.out.printf("%-13d%6.1f\n", i, (i * POUND_PER_KG));

		}

	}

}
