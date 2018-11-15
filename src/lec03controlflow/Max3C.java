package lec03controlflow;

import java.util.Arrays;

public class Max3C {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 1, 2, 31, 23, 1, 23, 12, 3, 123, 1, 23, 123, 123, 123, 1, 23, 123, 12, 3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
