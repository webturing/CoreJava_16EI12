package p3;

public class Application {
	static double getDistance(Point a, Point b) {//Global Improper
		
		return 1.5;
	}

	public static void main(String[] args) {
		Point a = new Point(3, 4);
		a.show();
		Point b = new Point(3);// b=(3,0)
		b.show();
		Point c = new Point();// c=(0,0);
		c.show();
		double r = a.getDistance(c);//OOP
		System.out.println(r);
		double area=Gemeotry.getArea(a,b,c);
		System.out.println(area);
		
		Point m=a.getMid(b);
		m.show();
		
	}
}
