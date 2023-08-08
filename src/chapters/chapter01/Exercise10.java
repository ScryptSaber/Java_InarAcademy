package chapters.chapter01;

public class Exercise10 {

	public static void main(String[] args) {
		// Input values
		double distanceKm = 14;
		int timeMinutes = 45;
		int timeSeconds = 30;

		// Convert distance from kilometers to miles
		double distanceMiles = distanceKm / 1.6;

		// Convert time from minutes and seconds to hours
		double timeHours = (timeMinutes + timeSeconds / 60.0) / 60.0;

		// Calculate average speed in miles per hour
		double averageSpeedMph = distanceMiles / timeHours;

		System.out.printf("The average speed is %.2f miles per hour.", averageSpeedMph);
	}

}
