package lec11oop2.ex01;

public class Shape2DTestor {
    public static void main(String[] args) {
        Shape2D a = new Triangle(3, 4, 5);
        Shape2D b = new Rectangle(3, 4);
        Shape2D c = new Circle(5);
        Shape2D s = a;
        System.out.println(s.area());
        s = b;
        System.out.println(s.area());
        s = c;
        System.out.println(s.area());
        Shape2D[] shapes = {a, b, c};
        for (Shape2D shape : shapes)
            System.out.println(shape.area());// RTTI
    }

}
