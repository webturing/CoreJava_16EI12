package lec15finalContest;

import java.util.Scanner;

// 问题 D: 数圈圈这个规模用字符串最为方便
public class D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.next();
            int tot = 0;
            for (char c : s.toCharArray()) {
                if (c == '0' || c == '6' || c == '9') ++tot;
                else if (c == '8') tot += 2;
            }
            System.out.println(tot);
        }
    }
}
