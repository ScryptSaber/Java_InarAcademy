package chapters.chapter01;

public class Exercise11 {

	public static void main(String[] args) {
		System.out.println("Current population: 312032486");
		System.out.println("One birth every 7 seconds\r\n" + "One death every 13 seconds\r\n"
				+ "One new immigrant every 45 seconds");
		System.out.println("one year = 365*24*60*60 seconds" + " = " + 31536000 + " seconds and so;\n");
		System.out.println(
				"First Year population: " + ((312032486 + ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 1)));
		System.out.println(
				"Second Year population: " + ((312032486 + ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 2)));
		System.out.println(
				"Third Year population: " + ((312032486 + ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 3)));
		System.out.println(
				"Fourth Year population: " + ((312032486 + ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 4)));
		System.out.println(
				"Fifth Year population: " + ((312032486 + ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 5)));

	}

}
