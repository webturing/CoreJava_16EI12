package lec04loop;

public class GetFirstDigit {
    public static void main(String[] args) {
        int n = 987654321;
        while (n >= 10) {
            n /= 10;
        }
        System.out.println(n);
    }
}
