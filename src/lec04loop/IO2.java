import java.util.Scanner;

/**
 * Sample Input 
 * 1 1 
 * 2 3 
 * 4 5
 * 
 * Sample Output 
 * 2 
 * 5 
 * 9 
 */
public class IO2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(a + b);
		}

		cin.close();

	}
}
