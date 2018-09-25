import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		int ans = Integer.MIN_VALUE;
		Scanner cin = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int t = cin.nextInt();
			if (t > ans)
				ans = t;
		}
		System.out.println(ans);
	}
}
