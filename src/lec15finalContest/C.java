package lec15finalContest;

import java.util.Scanner;

// 问题 C: N的第一位 这个规模用字符串最为方便
public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            String s = cin.next();
            System.out.println(s.charAt(0));
        }
    }
}
