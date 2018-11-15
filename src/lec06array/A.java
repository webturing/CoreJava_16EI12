package lec06array;

public class A {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] a = {27, 91, 18, 2, 5, 9};
        int tot = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                if (gcd(a[i], a[j]) == 1)
                    ++tot;
            }
        System.out.println(tot);
    }
}
