package lec05function;

public class AddApp {
	public static void main(String[] args) {
		// UnitTest ActualValue==ExpectedValue
		System.out.println(sum(1, 100) == 5050);
		System.out.println(sum(1, 1) == 1);
		System.out.println(sum(1, 10) == 55);
		System.out.println(sum(10, 1) == 0);
	}

	public static int sum(int start, int end) {
//		int s=0;
//		for(int i=start;i<=end;i++)
//			s+=i;
		if(start>end)return 0;
		int m=(end-start+1);
		return m*(end+start)/2;
	}
}
