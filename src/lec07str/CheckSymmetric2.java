package lec07str;

public class CheckSymmetric2 {
    public static void main(String[] args) {
        String s = "ABA";
        if (s.equals(new StringBuffer(s).reverse().toString())) {
            System.out.println("YES");
        }

    }
}
