import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 7, 6 };
		System.out.println(a.length);
		System.out.println(a[0]);
		// System.out.println(a[5]);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
