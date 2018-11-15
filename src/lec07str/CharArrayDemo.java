package lec07str;

import java.util.Arrays;

public class CharArrayDemo {
    /**
     * Char Array can be changed
     * but cannot resize
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] s = new char[10];
        Arrays.fill(s, 'A');
        System.out.println(s);
        s[1]++;
        System.out.println(s);
    }
}
