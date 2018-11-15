package lec07str;

public class StringAPI {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(s);// "ABC"
        System.out.println(s.length());// 3
        System.out.println(s.charAt(1));// 'B'
        System.out.println(s.hashCode());// ��"ABC"���ڵĵ�ַ
        s = s + "DEF";
        System.out.println(s);// ABCDEF
        System.out.println(s.hashCode());// ��"ABCDEF"���ڵĵ�ַ
    }
}
