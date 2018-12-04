package lec11oop2.p1;

class Point {
    int x, y;

    public Point() {
        this(0);
    }

    public Point(int x) {
        this(x, 0);
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getArea3(Point p, Point q, Point r) {
        double a = p.getDistance(q);
        double b = p.getDistance(r);
        double c = q.getDistance(r);
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getDistance(Point q) {
        double dx = this.x - q.x;
        double dy = this.y - q.y;
        return Math.hypot(dx, dy);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Point p = new Point();
        Point q = new Point(3, 4);
        Point r = new Point(3);
        System.out.println(p.getDistance(q));
        System.out.println(Point.getArea3(p, q, r));
    }
}
