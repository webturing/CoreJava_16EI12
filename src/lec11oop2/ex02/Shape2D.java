package lec11oop2.ex02;

public abstract class Shape2D {
    abstract double area();//�鷽�� abstract method

    void foo() {
        System.out.println(area());
        System.out.println(perimeter());
    }

    abstract double perimeter();
}
