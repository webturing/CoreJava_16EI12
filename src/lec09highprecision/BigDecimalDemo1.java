package lec09highprecision;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.pow(1.01, 20));
        BigDecimal x = new BigDecimal("1.01");
        System.out.println(x.pow(20));
        BigDecimal y = new BigDecimal("12.3456789");
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
        //   System.out.println(x.divide(y));
    }
}
