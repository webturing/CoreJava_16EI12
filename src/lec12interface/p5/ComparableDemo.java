package lec12interface.p5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    @Override
    public int compareTo(Point that) {
        return this.x - that.x;
    }
}

class IncreaseOrder implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return o1.x - o2.x;
    }

}

class DecreaseOrder implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return o2.x - o1.x;
    }

}

public class ComparableDemo {

    final static int N = 10;
    final static Point me = new Point(N / 2, N / 2);
    static Random rand = new Random();

    public static void main(String[] args) {
        Point points[] = new Point[10];//生成了10个null引用
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
            points[i].x = rand.nextInt(N);
            points[i].y = rand.nextInt(N);

        }
        System.out.println(Arrays.toString(points));
        Arrays.sort(points, new IncreaseOrder());
        System.out.println(Arrays.toString(points));

        Arrays.sort(points, new DecreaseOrder());
        System.out.println(Arrays.toString(points));
    }
}
