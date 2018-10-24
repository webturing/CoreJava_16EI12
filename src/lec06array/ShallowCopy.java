package lec06array;

import java.util.Arrays;


public class ShallowCopy {
public static void main(String[] args) {
	int []a={1,2,3,4};
	int []b={1};
	b=a;//shallow copy
	
	System.out.println(b[1]);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(a);
	System.out.println(b);
	b[2]=0;
	System.out.println(Arrays.toString(a));
}
}
