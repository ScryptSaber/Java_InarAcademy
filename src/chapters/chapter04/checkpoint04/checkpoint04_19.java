package chapters.chapter04.checkpoint04;

public class checkpoint04_19 {

	public static void main(String[] args) {
		String a = 1 + "Welcome " + 1 + 1;
		String b = 1 + "Welcome " + (1 + 1);
		String c = 1 + "Welcome " + ('\u0001' + 1);
		String d = 1 + "Welcome " + 'a' + 1;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
