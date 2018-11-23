package lec09highprecision;

public class FactorialB {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);//900亿亿 <21!
        for (int i = 0; i <= 25; i++) {
            System.out.println(i + "!=" + factorial(i));
        }
    }

    private static long factorial(int n) {
        long ret = 1L;
        for (int i = 2; i <= n; i++)
            ret *= i;
        return ret;
    }
}
