package lec05function;

public class IntLength {

    public static void main(String[] args) {
        System.out.println(1 == intLength(1));
        System.out.println(3 == intLength(101));
        System.out.println(6 == intLength(123456));
    }

    private static int intLength(int n) {
        if (n < 10) return 1;
        return intLength(n / 10) + 1;


    }
}
