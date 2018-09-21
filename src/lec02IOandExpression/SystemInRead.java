import java.io.IOException;


public class SystemInRead {
public static void main(String[] args) throws IOException {
	int c=System.in.read();
	int d=System.in.read();
	int x=(c-'0')*10+d-'0';
	System.out.println(x);
}
}
