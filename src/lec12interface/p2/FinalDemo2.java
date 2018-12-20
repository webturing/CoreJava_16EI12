package lec12interface.p2;

/**
 * final 修饰变量 （该变量就是常量)不可以用于赋值和组合赋值
 * final 对象 的引用不再改变
 */
class Point {
    int x, y;
}

public class FinalDemo2 {
    static final int N = 3;

    public static void main(String[] args) {
        int x = 3;
        x++;
        final int y = 4;
//	y=4;//CE
        final Point p = new Point();
        //p=new Point();//CE
        p.x = 3;
        p.y = 4;
    }

}
