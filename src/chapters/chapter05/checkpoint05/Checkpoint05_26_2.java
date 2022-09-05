package chapters.chapter05.checkpoint05;

public class Checkpoint05_26_2 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			if (number != 10 && number != 11)
				sum += number;
		}

		System.out.println("The sum is " + sum);

	}

}
