package chapters.chapter05;

public class Exercise05_25 {

	public static void main(String[] args) {
		int i = 0;
		double sum = 0;
		int n = 10000;
		while (n <= 100000) {
			for (i = 0; i <= n; i++) {

				sum += (Math.pow(-1, i + 1)) / (2 * i - 1);

			}
			double pi = sum * 4;
			System.out.println(pi);

			n += 10000;

		}
	}
}
