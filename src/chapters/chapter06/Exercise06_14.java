package chapters.chapter06;

public class Exercise06_14 {

	public static void main(String[] args) {
		System.out.println("i          m(i)");
		System.out.println("---------------");

		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%-10d%5.4f\n", i, m(i));
		}
	}

	public static double m(int a) {
		double sum = 0;
		for (double i = 1; i <= a; i++) {
			sum += Math.pow(-1, i + 1) / (2 * i - 1);

		}
		return sum * 4;
	}

}
