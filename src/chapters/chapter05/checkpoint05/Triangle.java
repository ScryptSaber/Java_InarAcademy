package chapters.chapter05.checkpoint05;

public class Triangle {

	public static void main(String[] args) {
		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i) * 2; j++) {
				System.out.print(" ");
			}

			for (int k = i; k > 0; k--) {
				System.out.print((k) + " ");

			}
			System.out.println();

		}
	}

}
