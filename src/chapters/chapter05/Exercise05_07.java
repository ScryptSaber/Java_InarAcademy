package chapters.chapter05;

public class Exercise05_07 {

	public static void main(String[] args) {

		int year = 1;
		int tuition = 10000;
		int total = 0;

		while (year <= 10) {

			tuition += (tuition * 0.05);
			year++;
		}

		System.out.println("Tuition in ten years: $" + tuition);
		while (year <= 14) {
			tuition += (tuition * 0.05);
			total += tuition;
			year++;
		}
		System.out.println("Total cost for four years' worth of tuition " +"total after 4 years= $" + total);
	}

}
