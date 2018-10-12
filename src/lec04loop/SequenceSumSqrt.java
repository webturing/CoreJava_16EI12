import java.util.Arrays;

public class SequenceSumSqrt {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		int n = 1000000005;
		//(j-i+1)*(i+j)==n*2
		int m=2*n;
		for(int p=(int) Math.sqrt(m);p>=1;p--){
			if(m%p!=0)continue;
			int q=m/p;
			//j-i+1=p
			//i+j=q
			int j=(p+q-1)/2;
			int i=(q-p+1)/2;
			if(j>i&&i+j==q&&j-i+1==p){
				System.out.println(i+" "+j);
			}
		}
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000.0+" second(s)");
	}

}
