package chapters.chapter06;

public class Exercise06_13 {

	public static void main(String[] args) {
		System.out.println("i         m(i)");
		System.out.println("---------------");

		for (int i = 1; i <= 20; i++) {
			System.out.printf("%-8d%6.4f\n", i, m(i));
		}
	}

	public static double m(int a) {
		double result = 0;
		for (double i = 1; i <= a; i++) {
			result += i / (i + 1);

		}
		return result;
	}
}
