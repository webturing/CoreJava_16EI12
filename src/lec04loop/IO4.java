package lec04loop;

import java.util.Scanner;

/**
 * Sample Input
 * 4 1 2 3 4
 * 5 1 2 3 4 5
 * <p>
 * Sample Output
 * 10
 * 15
 */
public class IO4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
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
