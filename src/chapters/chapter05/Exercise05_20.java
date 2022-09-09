package chapters.chapter05;

public class Exercise05_20 {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 8;
		int count = 0;
		int number = 2;

		while (number <= 1000) {

			boolean isPrime = true;

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;

				if (count % NUMBER_PER_LINE == 0) {
					System.out.println(number + " ");
				} 
				else {
					System.out.print(number + " ");
				}

				
			}
			number++;
		}
	}
}
