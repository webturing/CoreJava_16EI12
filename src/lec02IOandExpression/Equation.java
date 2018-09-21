import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();

		double delta = b * b - 4 * a * c;

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = c / a / x1;

		if (x1 < x2) {
			double t = x1;
			x1 = x2;
			x2 = t;
		}

	//	System.out.printf("%.2f %.2f\n", x1, x2);
	
		System.out.println(String.format("%.2f %.2f", x1, x2));

	}
}
