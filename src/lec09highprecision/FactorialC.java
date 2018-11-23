package lec09highprecision;

import java.math.BigInteger;

public class FactorialC {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);//900亿亿 <21!
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + "!=" + factorial(i));
        }
    }

    private static BigInteger factorial(int n) {
        BigInteger ret = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            ret = ret.multiply(new BigInteger(Integer.toString(i)));
        return ret;
    }
}
