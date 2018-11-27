package p4;

public class Tools {
	public static int gcd(int a,int b){
		return b==0?a:gcd(b,a%b);
	}
}
