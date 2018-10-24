package lec06array;

public class CubeChecker2 {
public static void main(String[] args) {
	int n=27;
	//int r=(int) Math.cbrt(n);
	//int r=(int)Math.pow(n,1.0/3);
	//System.out.println(r*r*r==n);
	boolean flag=false;
	for(int i=1;i<=n;i++){
		if(i*i*i==n){
			flag=true;
			break;
		}
	}
	if(flag)
		System.out.println("It is a cube.");
	else 
		System.out.println("It is not a cube.");
}
}
