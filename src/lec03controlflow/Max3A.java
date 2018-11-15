package lec03controlflow;

public class Max3A {
    public static void main(String[] args) {
        int a = 3, b = 4;
        // Method1:Brute
        // if (a > b)
        // System.out.println(String.format("%d %d", b, a));
        // else
        // System.out.println(String.format("%d %d", a, b));
        // Mehthod2
        // System.out.println(String.format("%d %d",Math.min(a,b),Math.max(a,
        // b)));
        // Swap
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(String.format("%d %d", a, b));
    }
}
