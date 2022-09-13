package chapters.chapter05;

public class Exercise05_43 {

	public static void main(String[] args) {
		int count = 0;
		int b = 2;
		int a;
		for (a = 1; a < 7; a++) {
			for (int i = 1; i <= 7 - a; i++) {

				System.out.println(a + " " + (b));
				b++;
				count++;

			}

			b = a + 2;
		}
		System.out.println("The total number of all combinations is " + count);
	}

}
