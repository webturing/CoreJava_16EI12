package lec07string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("ABC");
        System.out.println(b.length());
        System.out.println(b.charAt(2));
        b.setCharAt(2, 'D');
        System.out.println(b.toString());
        b.insert(1, 'Z');
        System.out.println(b.toString());
        b.delete(1, 2);
        System.out.println(b.toString());
        b.append('W');
        System.out.println(b);
        b.append("TTTT");
        System.out.println(b);
        b.reverse();
        System.out.println(b.toString());
    }
}
