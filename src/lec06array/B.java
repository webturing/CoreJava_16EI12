package lec06array;

public class B {
	static int OO[]={1,0,0,0,0,0,1,0,2,1};
	static int oo(int n){
		if(n<10)return OO[n];
		return OO[n%10]+oo(n/10);
	}
	public static void main(String[] args) {
		for(int i=0;i<OO.length;i++)
			System.out.println(i+":"+OO[i]);
		System.out.println(oo(14589));
	}
}
