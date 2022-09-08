package chapters.chapter05;

public class Exercise05_18_Pattern_C {

	public static void main(String[] args) {
		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i) * 2; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print((i - k) + " ");

			}
			System.out.println();
		}
	}
}
