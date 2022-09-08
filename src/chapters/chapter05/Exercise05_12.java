package chapters.chapter05;

public class Exercise05_12 {

	public static void main(String[] args) {
		int n = 1;

		while ((n * n) < 12000) {
			n++;
		}
		System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);
	}

}
