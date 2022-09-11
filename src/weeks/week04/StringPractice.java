package weeks.week04;

public class StringPractice {

	public static void main(String[] args) {

		length();
		substring();
		trimMetod();
		equalsIgnoreCasee();
		toUpperCasee();
		toLowerCasee();
		containss();
		charAtt();
		equalss();
	}

	public static void length() {
		String temp = "i love inar academy";
		int length = temp.length();
		System.out.println(length);
	}

	public static void substring() {
		String temp = "i love inar academy";
		String s = temp.substring(7);
		System.out.println(s);

	}

	public static void trimMetod() {
		String temp = "     iloveinaracademy   \n\n";
		System.out.println(temp.trim());
	}

	public static void equalsIgnoreCasee() {
		String temp = "apple";
		String a = "ApPle";

		System.out.println(temp.equalsIgnoreCase(a));

	}

	public static void toUpperCasee() {
		String temp = "apple";
		System.out.println(temp.toUpperCase());

	}

	public static void toLowerCasee() {
		String temp = "aPPle";
		System.out.println(temp.toLowerCase());

	}

	public static void containss() {
		String temp = "adana";
		String a = "dana";

		System.out.println(temp.contains(a));
	}

	public static void charAtt() {
		String temp = "aPPle";
		System.out.println(temp.charAt(2));
	}
	public static void equalss() {
		String temp = "apple";
		String a= "samsung";
		System.out.println(temp.equals(a));
}}
