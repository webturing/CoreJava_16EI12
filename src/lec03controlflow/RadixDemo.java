public class RadixDemo {
	public static void main(String[] args) {
		int x=1023;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toString(x, 2));
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toString(x, 8));
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toString(x, 16));
	
	}
}
