package p3;

public class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(double x) {
		this.x = x;
		this.y = 0;// 对象自己的引用
	}

	public Point() {
		this(0, 0);// this 代表构造方法self
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")");
	}

	public double getDistance(Point that) {
		double dx = this.x - that.x;
		double dy = this.y - that.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	public Point getMid(Point that){
		Point q=new Point();
		q.x=(this.x+that.x)/2;
		q.y=(this.y+that.y)/2;
		return q;
		
	}
}
