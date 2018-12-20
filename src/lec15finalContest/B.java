package lec15finalContest;

import java.util.Scanner;

// 问题 B: AC了吗 不断整除2,3,5再判断n是否是1
public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int D[] = {2, 3, 5};
            for (int d : D) {
                while (n % d == 0) {
                    n /= d;
                }
            }
            if (n == 1) {
                System.out.println("Accepted");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
