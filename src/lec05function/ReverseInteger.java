package lec05function;

import java.util. * ;
public class ReverseInteger
{
    public static int reverseInt(int n) {
        int m = 0;
        while (n > 0) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        return m;
    }
    public static boolean isSysmetric(int n){
        return n==reverseInt(n);
    }
    public static void main(String[] args) 
    {
        testIsSysmetric();
    }
    static void testIsSysmetric(){
        System.out.println(isSysmetric(121)==true);
        System.out.println(isSysmetric(1)==true);
        System.out.println(isSysmetric(0)==true);
        System.out.println(isSysmetric(987)==false);
    }
    static void testReverseInt(){
         System.out.println(reverseInt(123) == 321);
        System.out.println(reverseInt(1) == 1);
        System.out.println(reverseInt(100) == 1);
        System.out.println(reverseInt(987654321) == 123456789);
    }
}