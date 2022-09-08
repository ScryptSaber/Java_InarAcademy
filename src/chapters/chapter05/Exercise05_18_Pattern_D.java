package chapters.chapter05;

public class Exercise05_18_Pattern_D {

	public static void main(String[] args) {
		int n = 6;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
