package chapters.chapter06;

public class Exercise06_11 {

	public static void main(String[] args) {
		System.out.println("Sales Amount        Commission");
		System.out.println("------------------------------");

		for (int i = 10_000; i <= 100_000; i += 5000) {
			System.out.printf("%-20d%-10.1f\n", i, computeCommission(i));
		}

	}

	public static double computeCommission(double salesAmount) {
		double commission = 0;
		if (salesAmount > 0) {
			commission += 5000 * 0.08;
		}

		if (salesAmount > 5000) {
			commission += 5000 * 0.10;
		}
		if (salesAmount > 10000) {
			commission += (salesAmount - 10000) * 0.12;
		}

		return commission;
	}
}
