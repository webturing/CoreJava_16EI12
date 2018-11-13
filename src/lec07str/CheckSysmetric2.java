package lec07str;

public class CheckSysmetric2 {
public static void main(String[] args) {
	String s="ABA";
	StringBuffer b=new StringBuffer(s);
	b.reverse();
	String t=b.toString();
	if(s.equals(t)){
		System.out.println("YES");
	}
	
}
}
