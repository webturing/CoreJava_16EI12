package lec09highprecision;

import java.math.BigDecimal;

public class BigDecimalDivision {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("7");
        System.out.println(a.divide(b, 100, BigDecimal.ROUND_DOWN));
        System.out.println(a.divide(b, 50, BigDecimal.ROUND_FLOOR));
        System.out.println(a.divide(b, 50, BigDecimal.ROUND_HALF_UP));
        System.out.println(a.divide(b, 50, BigDecimal.ROUND_CEILING));
    }
}
