package lec05function;

public class IntDigitsSum {

	public static void main(String[] args) {
		System.out.println(1 == sumDigits(1));
		System.out.println(2 == sumDigits(101));
		System.out.println(21 == sumDigits(123456));
	}

	private static int sumDigits(int n) {
		if(n<10)return n;
		return sumDigits(n/10)+(n%10);
		
	}
}
