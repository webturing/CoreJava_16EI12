package lec03controlflow;

public class Max3D {
    public static void main(String[] args) {
        int a = 5, b = 4, c = 3;
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(String.format("%d %d %d", a, b, c));
    }
}
