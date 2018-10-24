package lec06array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTriangle {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		if (a[0] + a[1] > a[2])
			System.out.println("Ok");
		else
			System.out.println("Fail");
		cin.close();
	}
}
