package lec05function;

public class Binormial {
    public static void main(String[] args) {
        //testFactoial();
        testCnr();
    }

    private static void testFactoial() {
        System.out.println(1 == factorial(0));
        System.out.println(1 == factorial(1));
        System.out.println(120 == factorial(5));

    }

    private static void testCnr() {
        System.out.println(10 == cnr(5, 3));
        System.out.println(1 == cnr(5, 5));
        System.out.println(1 == cnr(5, 0));
    }

    public static long cnr(int n, int r) {
        return factorial(n) / factorial(n - r) / factorial(r);
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
