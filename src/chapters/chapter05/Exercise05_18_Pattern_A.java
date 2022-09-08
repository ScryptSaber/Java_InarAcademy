package chapters.chapter05;

public class Exercise05_18_Pattern_A {

	public static void main(String[] args) {
		int n = 6;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
