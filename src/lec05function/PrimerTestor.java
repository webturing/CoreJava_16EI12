package lec05function;

public class PrimerTestor {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int c = 3; c * c <= n; c += 2) {
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }

    }
}
