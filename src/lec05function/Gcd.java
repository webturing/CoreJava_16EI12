package lec05function;

public class Gcd {
	public static void main(String[] args) {
		System.out.println(2 == gcd(6, 8));
		System.out.println(6 == gcd(6, 0));
		System.out.println(33 == gcd(99, 66));
		System.out.println(1000000007 == gcd(1000000007, 1000000007));
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
static int lcm(int a,int b){
	return a*b/gcd(a,b);
}
}
