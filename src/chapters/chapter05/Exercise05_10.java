package chapters.chapter05;

public class Exercise05_10 {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		for (int i = 100; i < 1000; i++) {

			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
