package chapters.chapter05;

public class Exercise05_40 {

	public static void main(String[] args) {
		final int TOSS_TIMES = 1000000;
		int heads = 0;
		int tails = 0;

		for (int i = 0; i < TOSS_TIMES; i++) {
			int coin = (int) (Math.random() * 2);

			if (coin == 0) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Flipped 1000000 times..Result is\n" + heads + " times heads and " + tails + " times tails");

	}

}
