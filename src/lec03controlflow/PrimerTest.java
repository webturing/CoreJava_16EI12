public class PrimerTest {
	public static void main(String[] args) {
		int n = 1000000007;
		boolean flag = true;
		int m = (int) Math.sqrt(n);
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
