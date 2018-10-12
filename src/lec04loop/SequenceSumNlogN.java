import java.util.Arrays;

public class SequenceSumNlogN {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		int n = 10000005;
		long[] S=new long[n+1];
		for(int i=1;i<=n;i++)
			S[i]=S[i-1]+i;
		//System.out.println(Arrays.toString(S));
		for(int k=0;k<=n;k++){
			long x=S[k];
			long y=x+n;
			int j=Arrays.binarySearch(S, y);
			if(j>=0&&j>k+1){
				System.out.println((k+1)+" "+j);
			}
		}
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000.0+" second(s)");
	}

}
