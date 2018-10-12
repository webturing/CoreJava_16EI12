import java.util.Scanner;

/**
 * Sample Input
 *  2 
 *  1 1
 *  2 3
 * 
 * Sample Output 
 * 2 
 * 5
 * 
 */
public class IO3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0)		{
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(a + b);
		}

		cin.close();

	}
}
