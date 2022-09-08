package chapters.chapter05;

public class Exercise05_15 {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;

		for (int i = 33; i <= 126; i++) {
			System.out.print((char) i + " ");
			count++;

			if (count % NUMBER_PER_LINE == 0) {
				System.out.println();
			}

		}

	}

}
