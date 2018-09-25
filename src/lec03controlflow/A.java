public class A {
	public static void main(String[] args) {
		double s = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				s += 1.0 / i;
			} else {
				s -= 1.0 / i;
			}
		}
		System.out.println(String.format("%.8f", s));
	}
}
