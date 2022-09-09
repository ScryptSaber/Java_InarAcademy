package chapters.chapter05;

public class Exercise05_26 {

	public static void main(String[] args) {
		double e = 1.0;
		int n = 33;

		for (int i = 1; i <= n; i++) {

			double a = 1.0 / factor(i);
			e += a;
		}
		System.out.println("e is " + e);
	}

	public static int factor(int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		return sum;
	}
}
