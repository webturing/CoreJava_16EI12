package lec03controlflow;

public class PrimerTest2 {
    public static void main(String[] args) {
        int n = 1000000007;
        boolean flag = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
