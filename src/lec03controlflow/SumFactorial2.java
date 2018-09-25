
public class SumFactorial2 {
public static void main(String[] args) {
	int s=0;
	int t=1;
	for(int i=1;i<=9;i++)//O(n)
	{
		t*=i;
		s+=t;
		
	}
	System.out.println(s);
}
}
