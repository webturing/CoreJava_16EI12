package lec02ioandExpression;

public class IntegerLength {
    public static void main(String[] args) {
        int n = 12345;
        int k = (int) Math.log10(n) + 1;
        System.out.println(k);

        System.out.println(("" + n).length());
        int tot = 0;
        while (n > 0) {
            n /= 10;
            ++tot;
        }
        System.out.println(tot);
    }
}
