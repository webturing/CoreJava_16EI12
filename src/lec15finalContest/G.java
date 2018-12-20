package lec15finalContest;

import java.util.Scanner;

// 问题 G: 数数小木块 数学
public class G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int m = cin.nextInt();
            System.out.println(1L * m * (m + 1) * (m + 2) / 6);
        }
    }
}
