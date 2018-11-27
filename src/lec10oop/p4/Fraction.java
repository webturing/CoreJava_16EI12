package p4;

public class Fraction {
	int up, down;

	public Fraction(int up, int down) {
		if (up == 0) {
			up = 0;
			down = 1;
			return;
		}
		int absUp = Math.abs(up), absDown = Math.abs(down);
		if (up * down < 0) {
			up = -absUp;
			down = absDown;
		} else {
			up = absUp;
			down = absDown;
		}
		int g = Tools.gcd(absUp, absDown);
		up /= g;
		down /= g;
		this.up = up;
		this.down = down;
	}

	public static void main(String[] args) {
//		new Fraction(2, -6).show();
//		new Fraction(-22, -6).show();
//		new Fraction(12, -688).show();
//		new Fraction(-33, -66).show();
		Fraction a = new Fraction(-6, -18);// 1/3
		Fraction b = new Fraction(7, 42);// 1/6
		a.add(b).show();
		Fraction s=new Fraction(1,1);
		for(int i=2;i<=10;i++){
			Fraction t=new Fraction(1,i);
			s=s.add(t);
	
		}
		s.show();
	}

	private Fraction add(Fraction that) {		
		int up = this.up * that.down + that.up * this.down;
		int down = this.down * that.down;
		return new Fraction(up,down);
	}

	private void show() {
		System.out.println(up + "/" + down);

	}
}
