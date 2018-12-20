/**
 * 可变字符串StringBuffer使用
 */
package lec14Final;

public class SystemetricChecker {
    public static void main(String[] args) {
        String s = "ABAB";
        String t = new StringBuffer(s).append('a').reverse().toString();
        System.out.println(t);
        System.out.println(s.equals(t));

    }
}
