package lec15finalContest;

import java.util.Arrays;
import java.util.Scanner;

// 问题 A: 三数取中: 很多种方法来解，排序最为简洁
public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a[] = {cin.nextInt(), cin.nextInt(), cin.nextInt()};
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
