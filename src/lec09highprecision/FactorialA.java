package lec09highprecision;

public class FactorialA {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);//21亿<13！
        for (int i = 0; i <= 15; i++) {
            System.out.println(i + "!=" + factorial(i));
        }
    }

    private static int factorial(int n) {
        int ret = 1;
        for (int i = 2; i <= n; i++)
            ret *= i;
        return ret;
    }
}
