package lec04loop;

public class SequenceSumSquare {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 100005;
        // n=i+(i+1)+....+j
        for (int i = 1; i <= n; i++)
            for (int j = i + 1; j <= n; j++) {
                int s = (j - i + 1) * (j + i) / 2;
                if (s == n) {
                    System.out.println(i + " " + j);
                }
            }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + " second(s)");
    }

}
