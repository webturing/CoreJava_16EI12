package lec14Final;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sample Input 3 100 99 98 4 100 99 98 97
 * Sample Output 99.00 98.50
 *
 * @author Administrator
 * 不用修改代码，本地调用文件，oj提交时候自动绑定标准
 */

public class P1159 {
    static Scanner cin;
    static PrintWriter cout;

    static {
        try {
            cin = new Scanner(new File("1159.txt"));
            cout = new PrintWriter(System.out);
        } catch (IOException e) {
            cin = new Scanner(System.in);
        }
    }

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int n = cin.nextInt();
            double s[] = new double[n];
            for (int i = 0; i < n; i++)
                s[i] = cin.nextDouble();
            // System.out.println(Arrays.toString(s));
            Arrays.sort(s);
            double tot = 0;
            for (int i = 1; i <= n - 2; i++)
                tot += s[i];
            cout.println(String.format("%.2f", tot / (n - 2)));

        }
        cin.close();
        cout.close();
    }
}
