package lec09highprecision;

import java.math.BigInteger;
import java.util.Scanner;


public class CheckMathTheory {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger x = cin.nextBigInteger();
        int step = 0;
        while (true) {
            String s = x.toString();
            String t = new StringBuffer(s).reverse().toString();
            if (s.equals(t)||step>200)
                break;
            ++step;
            BigInteger y = new BigInteger(t);
            BigInteger z = x.add(y);
            System.out.println(String.format("%d:%d+%d=%d", step, x, y, z));
            x = z;
        }
    }
}
