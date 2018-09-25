public class Max3B {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 4;
		if (a <= b && b <= c) {
			System.out.println(String.format("%d %d %d", a, b, c));
		}
		else if (a <= c && c <= b) {
			System.out.println(String.format("%d %d %d", a, c, b));
		}
		else if (b <= a && a <= c) {
			System.out.println(String.format("%d %d %d", b, a, c));
		}
		else if (b <= c && c <= a) {
			System.out.println(String.format("%d %d %d", b, c, a));
		}
		else if (c <= a && a <= b) {
			System.out.println(String.format("%d %d %d", c, a, b));
		}
		else if (c <= b && b <= a) {
			System.out.println(String.format("%d %d %d", c, b, a));
		}
	}
}
