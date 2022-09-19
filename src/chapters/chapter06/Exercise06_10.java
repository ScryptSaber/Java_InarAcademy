package chapters.chapter06;

public class Exercise06_10 {

	public static void main(String[] args) {

		int n = 10000;
		System.out.println("The first " + n + " prime numbers are :");
		printPrimeNumbers(n);
	}

	public static void printPrimeNumbers(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				if (count % 10 == 0) {
					System.out.println();
				}
				System.out.printf("%-5d", i);
				count++;
			}
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}
}
