package lec07str;

import java.util.Arrays;

public class ImmutableString {
    /**
     * String is read-only/Immutable
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(s);// "ABC"
        System.out.println(s.length());// 3
        System.out.println(s.charAt(1));// 'B'
        System.out.println(s.hashCode());// "ABC" hashCode
        System.out.println("apple".compareTo("banana"));// apple<banana according dictionary order
        System.out.println("apple".compareTo("Apple"));
        System.out.println("hello".concat(" world"));// +
        System.out.println("abcdefgab".indexOf("ab"));
        System.out.println("abcdefgab".indexOf("abd"));
        String[] words = "to know everything is to know nothing".split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("abcdefg".substring(2));
        System.out.println("abcdefg".substring(2, 4));
        System.out.println("abcdefg".substring(1, 4));// "bcd"
        System.out.println("asjdfjJKSDFJKJK".toLowerCase());
    }
}
