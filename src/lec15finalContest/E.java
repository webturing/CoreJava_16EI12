package lec15finalContest;

import java.math.BigInteger;
import java.util.Scanner;

// 问题 E: 阶乘 这个规模100用字符串和Java BigInteger最为方便
public class E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        String s = b.toString();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
