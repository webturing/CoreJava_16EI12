package lec15finalContest;

import java.util.Scanner;

// 问题 H: Structured Program II - Matrix Multiplication 按照定义即可
public class H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            int A[][] = new int[a][b];
            int B[][] = new int[b][c];
            int C[][] = new int[a][c];
            for (int i = 0; i < a; i++) for (int j = 0; j < b; j++) A[i][j] = cin.nextInt();
            for (int i = 0; i < b; i++) for (int j = 0; j < c; j++) B[i][j] = cin.nextInt();
            for (int i = 0; i < a; i++)
                for (int j = 0; j < c; j++) {
                    for (int k = 0; k < b; k++)
                        C[i][j] += A[i][k] * B[k][j];
                }
            for (int i = 0; i < a; i++) {
                System.out.print(C[i][0]);
                for (int j = 1; j < c; j++) {
                    System.out.print(" " + C[i][j]);
                }
                System.out.println();
            }
        }
    }
}
