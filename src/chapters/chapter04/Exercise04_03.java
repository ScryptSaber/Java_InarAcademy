package chapters.chapter04;

public class Exercise04_03 {

	public static void main(String[] args) {
		final double EARTH_AVERAGE_RADIUS = 6371.01;

		double x1 = 35.2270869;
		double y1 = -80.8431267;
		double x1Radian = Math.toRadians(x1);
		double y1Radian = Math.toRadians(y1);

		double x2 = 33.7489954;
		double y2 = -84.3879824;
		double x2Radian = Math.toRadians(x2);
		double y2Radian = Math.toRadians(y2);

		double x3 = 32.0835407;
		double y3 = -81.0998342;
		double x3Radian = Math.toRadians(x3);
		double y3Radian = Math.toRadians(y3);

		double x4 = 28.5383355;
		double y4 = -81.3792365;
		double x4Radian = Math.toRadians(x4);
		double y4Radian = Math.toRadians(y4);

		double d1 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x2Radian)
				+ Math.cos(x1Radian) * Math.cos(x2Radian) * Math.cos(y1Radian - y2Radian));

		double d2 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x3Radian)
				+ Math.cos(x1Radian) * Math.cos(x3Radian) * Math.cos(y1Radian - y3Radian));

		double d3 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x4Radian) * Math.sin(x2Radian)
				+ Math.cos(x4Radian) * Math.cos(x2Radian) * Math.cos(y4Radian - y2Radian));

		double d4 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3Radian) * Math.sin(x4Radian)
				+ Math.cos(x3Radian) * Math.cos(x4Radian) * Math.cos(y3Radian - y4Radian));

		double d5 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3Radian) * Math.sin(x2Radian)
				+ Math.cos(x3Radian) * Math.cos(x2Radian) * Math.cos(y3Radian - y2Radian));

		double s1 = (d1 + d2 + d5) / 2;
		double s2 = (d3 + d4 + d5) / 2;

		double A1 = Math.pow(s1 * (s1 - d1) * (s1 - d2) * (s1 - d5), 0.5);

		double A2 = Math.pow(s2 * (s2 - d3) * (s2 - d4) * (s2 - d5), 0.5);

		System.out.println("The estimated area enclosed by these four cities is " + (A1 + A2));

	}

}
