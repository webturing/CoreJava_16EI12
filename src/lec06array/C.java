package lec06array;

public class C {

    public static void main(String[] args) {
        int a = 123;
        System.out.println(Integer.toString(a));
        System.out.println(Integer.toString(a, 16));
        System.out.println(Integer.toHexString(a));
        String s = "9912";
        System.out.println(Integer.parseInt(s));//s=9*10^3+9*10^2+1*10^1+2*10^0
        System.out.println(Integer.parseInt(s, 16));//s=9*16^3+9*16^2+1*16^1+2*16^0
    }
}
