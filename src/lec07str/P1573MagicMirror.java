package lec07str;

public class P1573MagicMirror {

    public static void main(String[] args) {
        String s = "ABBAABBA";
        if (check(s)) {
            s = s.substring(0, s.length() / 2);
        }
        System.out.println(s);

    }

    private static boolean check(String s) {
        if (s.length() < 2 || s.length() % 2 != 0)
            return false;
        String t = new StringBuffer(s).reverse().toString();
        return s.equals(t);
    }

}
