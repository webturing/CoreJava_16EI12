package lec06array;

public class Filter {
    static int N = 100;
    static boolean[] primer = new boolean[N];

    static void fill() {// n*loglogN
        for (int i = 0; i < N; i++)
            primer[i] = true;
        primer[0] = primer[1] = false;// delete 0,1
        for (int i = 2; i * i <= N; i++) {
            if (primer[i]) {
                for (int j = i * i; j < N; j += i) {
                    primer[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        fill();
        for (int i = 0; i < N; i++)
            if (primer[i])
                System.out.println(i);
    }
}
