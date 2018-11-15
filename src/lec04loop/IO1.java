package lec04loop;

import java.util.Scanner;

/**
 * Sample Input
 * 1 1
 * <p>
 * Sample Output
 * 2
 */
public class IO1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println(a + b);

        cin.close();

    }
}
