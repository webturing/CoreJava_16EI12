package lec06array;

import java.util.Scanner;


public class CheckTriangle2 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int a=cin.nextInt();
	int b=cin.nextInt();
	int c=cin.nextInt();
	if(a>0&&b>0&&c>0&&a+b>c&&b+c>a&&c+a>b)
		System.out.println("Ok");
	else
		System.out.println("Fail");
	cin.close();
}
}
