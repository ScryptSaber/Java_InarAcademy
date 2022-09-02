package chapters.chapter04;

public class Exercise04_25 {

	public static void main(String[] args) {
		int letter1 = 65 + (int) (Math.random() * 26);
		int letter2 = 65 + (int) (Math.random() * 26);
		int letter3 = 65 + (int) (Math.random() * 26);

		int fourDigit = 1000 + (int) (Math.random() * 9000);

		System.out.println("Vehicle plate number is " + (char) letter1 + (char) letter2 + (char) letter3 + fourDigit);

	}

}
