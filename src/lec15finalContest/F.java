package lec15finalContest;

import java.util.Scanner;

// 问题 F: 大小写互换 字符串处理基础题
public class F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            char cs[] = cin.next().toCharArray();
            for (int i = 0; i < cs.length; i++) {
                if (Character.isUpperCase(cs[i])) {
                    cs[i] = Character.toLowerCase(cs[i]);
                } else if (Character.isLowerCase(cs[i])) {
                    cs[i] = Character.toUpperCase(cs[i]);
                }
            }
            System.out.println(cs);
        }
    }
}
