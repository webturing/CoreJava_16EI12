
public class GetFirstDigit3 {
	public static void main(String[] args) {
		int n=987654321;
		double y=Math.log10(n);
		System.out.println(y);
		y=y-(int)y;
		double z=Math.pow(10,y);
		System.out.println((int)z);
	}
}
