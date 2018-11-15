package lec03controlflow;

public class SumFactorial {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 9; i++)//O(n^2)
        {
            int t = 1;
            for (int j = 2; j <= i; j++)
                t *= j;
            s += t;
        }
        System.out.println(s);
    }
}
