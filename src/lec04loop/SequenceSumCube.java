package lec04loop;

public class SequenceSumCube {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 10005;
        // n=i+(i+1)+....+j
        for (int i = 1; i <= n; i++)
            for (int j = i + 1; j <= n; j++) {
                int s = 0;
                for (int k = i; k <= j; k++)
                    s += k;
                if (s == n) {
                    System.out.println(i + " " + j);
                }
            }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + " second(s)");
    }

}
