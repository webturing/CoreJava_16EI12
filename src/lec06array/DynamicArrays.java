package lec06array;

import java.util.Arrays;


public class DynamicArrays {
    public static void main(String[] args) {
        int a[] = new int[3];
        int j = 0;
        a[j++] = 0;
        System.out.println(Arrays.toString(a));
        a[j++] = 1;
        System.out.println(Arrays.toString(a));
        a[j++] = 2;
        System.out.println(Arrays.toString(a));

        int[] b = new int[a.length * 2];
        for (int i = 0; i < a.length; i++) b[i] = a[i];
        a = b;
        a[j++] = 3;
        a[j++] = 4;
        a[j++] = 5;

        System.out.println(Arrays.toString(a));

    }
}
