package lec03controlflow;

public class Max2 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 4;
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;
        System.out.println(String.format("%d %d %d", min, mid, max));
    }
}
