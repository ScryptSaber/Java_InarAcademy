package chapters.chapter05.checkpoint05;

public class Checkpoint05_26 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 20 && sum < 100) {
			number++;
			sum += number;
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

	}

}
