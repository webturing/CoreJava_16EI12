package p4;

public class Time24 {
	int h, m, s;
	private Time24 add(Time24 that) {
		return new Time24(this.h + that.h, this.m + that.m, this.s + that.s);
	}

	private void show() {
		String fmt = String.format("%02d:%02d:%02d", h, m, s);
		System.out.println(fmt);
	}
	public Time24(int h, int m, int s) {
		int t = h * 3600 + m * 60 + s;
		this.s = t % 60;
		this.m = (t / 60) % 60;
		this.h = (t / 3600) % 24;
	}

	public static void main(String[] args) {
		Time24 start = new Time24(19, 00, 0);
		start.show();
		Time24 last = new Time24(0, 45, 0);
		last.show();
		Time24 rest = new Time24(0, 10, 0);
		Time24 end = start.add(last).add(rest).add(last).add(rest).add(last);
		end.show();
	}

	
}
