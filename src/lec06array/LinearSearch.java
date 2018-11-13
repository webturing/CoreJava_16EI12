package lec06array;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 7, 8, 2, 3, };
		int k = 2;
		int pos = find(a, k);
		System.out.println(pos);
	}

	static int find(int[] a, int k) {//O(n)
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k)
				return i;
		}
		return -1;
	}
}
