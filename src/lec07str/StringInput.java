package lec07str;

import java.util.Arrays;
import java.util.Scanner;

public class StringInput {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// String str=cin.next();//��ȡ�������ո���ַ���
		String str = cin.nextLine();// ��ȡһ����
		System.out.println(str);
		String words[] = str.split(" ");
		int max = 0;
		for (String word : words) {
			if (word.length() > max)
				max = word.length();
		}
		System.out.println(max);
		String data = "2018/11/13";
		String dd[] = data.split("/");
		System.out.println(Arrays.toString(dd));
		char cs[]="abc".toCharArray();
		String r=new String(cs);
	}
}
