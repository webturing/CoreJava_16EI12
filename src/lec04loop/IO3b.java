import java.util.Scanner;

/**
 * Sample Input
 *  1 1
 *  2 3
 *  0 0
 * 
 * Sample Output 
 * 2 
 * 5
 * 
 */
public class IO3b {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a==0&&b==0)
				break;
			System.out.println(a + b);
		}

		cin.close();

	}
}
