package lec12interface.p3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Point implements Comparable<Point> {
    int x, y;


    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%d,%d)", x, y);
    }

    @Override
    public int compareTo(Point that) {
        // TODO Auto-generated method stub
        return this.x - that.x;// 按照x的增序
    }
}

class IncreaseOrder implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {

        // return o1.x-o2.x;//按照x的增序
        return o2.x - o1.x;// 按照x的降序
    }

}

public class WeChatDemo {
    final static int N = 10;
    final static Point me = new Point(N / 2, N / 2);
    static Random rand = new Random();

    public static void main(String[] args) {
        Point[] points = new Point[N];
        System.out.println(Arrays.toString(points));// N个null引用
        for (int i = 0; i < N; i++) {
            points[i] = new Point();
            points[i].x = rand.nextInt(N);
            points[i].y = rand.nextInt(N);
        }
        System.out.println(Arrays.toString(points));
        Arrays.sort(points, new Comparator<Point>() {

            @Override
            public int compare(Point p1, Point p2) {
                double d1 = Math.hypot(me.x - p1.x, me.y - p1.y);
                double d2 = Math.hypot(me.x - p2.x, me.y - p2.y);
                double dif = d1 - d2;
                if (dif < 0)
                    return -1;
                if (dif > 0)
                    return 1;
                return 0;
            }

        });
        System.out.println(Arrays.toString(points));


    }

}
