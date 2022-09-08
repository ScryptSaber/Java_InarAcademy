package chapters.chapter05;

public class Exercise05_13 {

	public static void main(String[] args) {
		int n = 1;

		while ((n * n * n) < 12000) {
			n++;
		}
		System.out.println("Largest integer n such that n^3 is less than 12,000: " + (n-1));

	}

}
