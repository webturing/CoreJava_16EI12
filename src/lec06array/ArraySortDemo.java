package lec06array;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        // /����һ������Ϊ10������a
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(a));// debug
        // Arrays.sort(a);
        Arrays.sort(a, 0, 5);// a[0:4]
        System.out.println(Arrays.toString(a));// debug
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));// debug
        reverse(a);
        System.out.println(Arrays.toString(a));

    }

    private static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
            //System.out.println("..." + Arrays.toString(a));
        }

    }
}
