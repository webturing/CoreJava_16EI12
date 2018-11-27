package p3;

public class Gemeotry {
	public static double getArea(Point a, Point b, Point c) {
		// TODO
		double x = a.getDistance(b);
		double y = a.getDistance(c);
		double z = b.getDistance(c);
		double s = (x + y + z) / 2;
		return Math.sqrt(s * (s - x) * (s - y) * (s - z));

	}
}
