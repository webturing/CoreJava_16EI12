package lec15finalContest;

import java.util.Scanner;

// 问题  I: 质因数分解,注意输出的格式
public class I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        boolean first = true;
        System.out.print(n + "=");
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                if (first) {
                    System.out.print(i);
                    first = false;
                } else {
                    System.out.print("*");
                    System.out.print(i);
                }
                n /= i;
            }
            i++;
        }
        System.out.println();

    }
}
