package lec12interface.p4;

/**
 * 接口:所有方法都是public虚方法，所有字段都是静态常final 字段
 *
 * @author Administrator
 */
interface A {
    void sing();
}

public interface Shape2D {
    //	void g(){
//
//	}
    double PI = 3.1415926;

    double area();

    double perimeter();
}

class Triangle implements Shape2D, A {

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void sing() {
        // TODO Auto-generated method stub

    }

}