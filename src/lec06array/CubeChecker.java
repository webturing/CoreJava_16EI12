package lec06array;

import java.util.Arrays;

public class CubeChecker {
	public static void main(String[] args) {
		int n = 27;
		int[] B = new int[1024];
		for (int i = 0; i < B.length; i++)
			B[i] = i * i * i;
		System.out.println(Arrays.toString(B));
		int pos = Arrays.binarySearch(B, n);
		if (pos < 0) {
			System.out.println("It is not a cube.");
		} else {
			System.out.println("It is a cube.");
		}

	}
}
