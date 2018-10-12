public class IO0a {
	// final all square numbers like 'aabb'
	public static void main(String[] args) {
		for (int i = 1100; i <= 9999; i++) {
			int j=(int) Math.sqrt(i);
			if(j*j!=i)
				continue;
			int left=i/100;
			int right=i%100;
			if(left%11==0&&right%11==0){
				System.out.println(i);
			}
		}
	}
}
