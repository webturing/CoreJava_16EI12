package lec06array;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 3, 3, 5, 7, 8, };
		int k = 12;
		int pos = Arrays.binarySearch(a, k);//lb(n)
		if(pos<0)
			System.out.println("NOT FOUND!");
		else
			System.out.println(a[pos]==k);
	}

}
