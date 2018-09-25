import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int ans = cin.nextInt();
		for (int i = 0; i < 9; i++) {
			int t = cin.nextInt();
			if (t > ans)
				ans = t;
		}
		System.out.println(ans);
	}
}
