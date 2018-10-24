package lec06array;


import java.util.Arrays;


public class ArrayDemo {
public static void main(String[] args) {
	int a[]=null;
	System.out.println(a);
	int [] b;
	//int c[3];//CE
	int []c={1,2,3};
	System.out.println(c);//hashcode
	
	for(int i=0;i<c.length;i++)//读写
		System.out.print(c[i]+" ");
	System.out.println();
	
	for(int i:c)//for_each 只读模式访问数组
		System.out.print(i+" ");
	System.out.println();
	
	System.out.println(Arrays.toString(c));//适合debug dump
	int d[]=new int[4];
	System.out.println(d);
	System.out.println(Arrays.toString(d));//适合debug dump
	
}
}
