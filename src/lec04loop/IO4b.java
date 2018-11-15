package lec04loop;

import java.util.Scanner;

/**
 * Sample Input
 * 2
 * 4 1 2 3 4
 * 5 1 2 3 4 5
 * <p>
 * Sample Output
 * 10
 * 15
 */
public class IO4b {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            int tot = 0;
            for (int i = 0; i < n; i++) {
                tot += cin.nextInt();
            }
            System.out.println(tot);
        }

        cin.close();

    }
}
