package lec05function;

public class YHTriangle {
	public static void main(String[] args) {
		int n = 30;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(Binormial2.cnr(i, j) + " ");
			}
			System.out.println();
		}
	}
}
