package lec06array;


import java.util.Arrays;


public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = null;
        System.out.println(a);
        int[] b;
        //int c[3];//CE
        int[] c = {1, 2, 3};
        System.out.println(c);//hashcode

        for (int i = 0; i < c.length; i++)//��д
            System.out.print(c[i] + " ");
        System.out.println();

        for (int i : c)//for_each ֻ��ģʽ��������
            System.out.print(i + " ");
        System.out.println();

        System.out.println(Arrays.toString(c));//�ʺ�debug dump
        int d[] = new int[4];
        System.out.println(d);
        System.out.println(Arrays.toString(d));//�ʺ�debug dump

    }
}
