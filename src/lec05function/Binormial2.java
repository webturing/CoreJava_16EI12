package lec05function;

public class Binormial2 {
	public static void main(String[] args) {
		testCnr();
	}

	private static void testCnr() {
		System.out.println(10==cnr(5,3));
		System.out.println(1==cnr(5,5));
		System.out.println(1==cnr(5,0));
		System.out.println(cnr(25,23));
		System.out.println(Binormial.cnr(25,23));
	}

	public static long cnr(int n, int r) {
		if (2 * r > n)
			r = n - r;
		long p = 1;
		for (int i = 0; i < r; i++)
			p *= n - i;
		for (int i = 2; i <= r; i++)
			p /= i;
		return p;
	}

}
