package lec09highprecision;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("111111111111111111111111111111111");
        BigInteger b = new BigInteger("99999999999999999999999999999999");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
        System.out.println(a.pow(10));
        System.out.println(a.isProbablePrime(20));//test a is a primer with  a major prob (1-4^(-20))
    }
}
