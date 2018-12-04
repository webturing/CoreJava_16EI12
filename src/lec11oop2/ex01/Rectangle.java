package lec11oop2.ex01;

public class Rectangle extends Shape2D {
    int len, wid;

    public Rectangle(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }

    public double area() {
        return this.len * this.wid;
    }
}
