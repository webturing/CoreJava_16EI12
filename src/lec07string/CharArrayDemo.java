package lec07string;

import java.util.Arrays;

public class CharArrayDemo {
    public static void main(String[] args) {
        char[] s = new char[10];
        Arrays.fill(s, 'A');
        System.out.println(s);
        s[1]++;
        System.out.println(s);
    }
}
